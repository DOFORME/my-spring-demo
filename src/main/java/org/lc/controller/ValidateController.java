package org.lc.controller;

import lombok.extern.slf4j.Slf4j;
import org.lc.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author lc
 */
@Slf4j
@Controller
@RequestMapping("validate")
public class ValidateController {

    @RequestMapping("test1")
    public String test1(@Valid @ModelAttribute("student") Student student, BindingResult result) {
        log.info("s: {}", student);
        log.info("valid result has error: {}", result.hasErrors());
        return "validate";
    }
}
