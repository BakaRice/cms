package com.ricemarch.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 測試 controller
 * @author: tanwentao
 * @date: 2021/3/3
 */

@RestController
@RequestMapping("/api/")
public class TestController {

    @GetMapping("/hi")
    public String get() {
        return "hi";
    }
}
