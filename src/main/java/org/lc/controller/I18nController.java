package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("i18n")
public class I18nController {

    @ResponseBody
    @RequestMapping("test")
    public void i18nTest(HttpServletRequest request) {
        RequestContext context = new RequestContext(request);
        String msg = context.getMessage("msg.test");
        log.info("msg: {}", msg);
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", msg);
//        return mav;
    }
}
