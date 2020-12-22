package com.springboot.hellowworld.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mohammed Amr
 * @created 20/12/2020 - 07:33
 * @project Springboot Hello World Demo
 */

@RestController
public class HelloController {

    private Map<String, String> result = new HashMap<>();

    @RequestMapping("/hello")
    public Map<String, String> hello() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
}
