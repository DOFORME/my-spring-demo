package org.lc.controller;


import lombok.AllArgsConstructor;
import org.lc.service.CacheService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("cache")
public class CacheController {

    private CacheService cacheService;

    @RequestMapping("test")
    public void test() {
        cacheService.test("1");
    }
}
