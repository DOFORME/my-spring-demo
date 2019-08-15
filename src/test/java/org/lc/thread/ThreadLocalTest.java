package org.lc.thread;

import org.junit.jupiter.api.Test;
import org.lc.entity.Student;

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

    @Test
    void get5() {
        ThreadLocal<String> t = new InheritableThreadLocal<>();
        t.set("test");
        new Thread(() -> {
            // 有值，值为test，是父线程的拷贝
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sub thread:" + t.get());
        }).start();
        t.set("test2");
        System.out.println("parent thread:" + t.get());
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void get6() {
        ThreadLocal<Student> t = new InheritableThreadLocal<>();
        Student student = new Student();
        student.setName("bob").setAge(20);
        t.set(student);
        new Thread(() -> {
            // 有值，拷贝的是父线程保存对象的链接，打印结果和父线程一样
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sub thread:" + t.get());
        }).start();
        student.setName("alice");
        System.out.println("parent thread:" + t.get());
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
