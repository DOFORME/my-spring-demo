package org.lc.controller;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("el")
@RestController
public class ExpressionController {

    @GetMapping("test")
    public String test() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'hello' + 'world'");
        return (String) exp.getValue();
    }
}
