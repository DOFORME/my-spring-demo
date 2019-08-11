package org.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        request.setAttribute("mvc test", "test");
        return "success";
    }

    @ResponseBody
    @RequestMapping("thymeleafIndex")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test", "test string");
        return modelAndView;
    }

    @GetMapping("mvc")
    public ModelAndView index3() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("mvc", "mvc");
        return mv;
    }
}
