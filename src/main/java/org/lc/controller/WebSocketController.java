package org.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("socket")
public class WebSocketController {

    @RequestMapping("toSocket")
    public String test1() {
        return "socket";
    }
}
