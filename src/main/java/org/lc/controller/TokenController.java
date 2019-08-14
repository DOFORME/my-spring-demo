package org.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("token")
public class TokenController {


    @RequestMapping("test1")
    public String test1() {
        return "token";
    }
}
