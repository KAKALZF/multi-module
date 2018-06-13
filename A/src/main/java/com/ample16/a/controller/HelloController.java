package com.ample16.a.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linzefeng on 2018-06-13
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "a";
    }
}
