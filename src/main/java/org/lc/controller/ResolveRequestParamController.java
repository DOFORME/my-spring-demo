package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author lc
 */
@Slf4j
@RestController
@RequestMapping("param")
@SessionAttributes({"str", "str2"})
public class ResolveRequestParamController {

    /**
     * 该类下路径每次处理前都会调用，当变量存放在session里时一次会话只会调用一次
     */
    @ModelAttribute("str")
    public String getStr() {
        log.info("come in getStr()");
        return "test";
    }

    @RequestMapping("test")
    public void m1(Model model) {
        log.info("come in m1()");
        String str = (String) model.asMap().get("str");
        log.info("str: {}", str);
    }

    /**
     * 此方法调用会产生异常，需要session里含有参数名为str2的字符串对象
     */
    @RequestMapping("test2")
    public void m2(@ModelAttribute("str2") String str2) {
        log.info("come in m2()");
        log.info("s2: {}", str2);
    }
}
