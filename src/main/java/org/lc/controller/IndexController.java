package org.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        request.setAttribute("mvc test", "test");
        return "success";
    }

    @ResponseBody
    @RequestMapping("index2")
    public String index2() {
        return "success";
    }
}
