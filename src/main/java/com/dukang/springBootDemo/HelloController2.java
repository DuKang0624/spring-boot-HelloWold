package com.dukang.springBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DUKANG
 * @create 2018/08/11
 * @since 1.0.0
 * Description:
 */
@RestController
public class HelloController2 {
    @RequestMapping("/helloWorld")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/helloWorld2")
    public String hello2() {
        return "hello world 2";
    }
}
