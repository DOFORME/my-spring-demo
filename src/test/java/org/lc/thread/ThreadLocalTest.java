package org.lc.thread;

import org.junit.jupiter.api.Test;

/**
 * @author lc
 */
public class ThreadLocalTest {

    @Test
    void set() {
        ThreadLocal<String> t = new ThreadLocal<>();
        // 后set的有效，前面的被覆盖
        t.set("test");
        t.set("2");
        System.out.println(t.get());
    }

    @Test
    void get() {
        ThreadLocal<String> t = new ThreadLocal<>();
        t.set("test");
        new Thread(() -> {
            // 子线程无法获取值
            System.out.println("sub thread:" + t.get());
        }).start();
        System.out.println("parent thread:" + t.get());
    }

    @Test
    void get2() {
        ThreadLocal<String> t = new ThreadLocal<>();
        t.set("test");
        new Thread(() -> {
            ThreadLocal<String> t2 = new ThreadLocal<>();
            // null
            System.out.println("sub thread:" + t2.get());
        }).start();
        System.out.println("parent thread:" + t.get());
    }

    @Test
    void get3() {
        ThreadLocal<String> t = new ThreadLocal<>();
        t.set("test");
        new Thread(() -> {
            ThreadLocal<String> t2 = new InheritableThreadLocal<>();
            // null
            System.out.println("sub thread:" + t2.get());
        }).start();
        System.out.println("parent thread:" + t.get());
    }

    @Test
    void get4() {
        ThreadLocal<String> t = new InheritableThreadLocal<>();
        t.set("test");
        new Thread(() -> {
            // 有值
            System.out.println("sub thread:" + t.get());
        }).start();
        System.out.println("parent thread:" + t.get());
    }
}
