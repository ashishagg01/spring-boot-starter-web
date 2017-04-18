package com.ttn.aem.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping("calc")
    public int calc(@RequestParam int left, @RequestParam int right) {
        return left + right;
    }
}
