package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jinbang
 * @create 2019-02-26 16:11
 */

@Controller
public class HellooController {

    @ResponseBody
    @RequestMapping("/helloo")
    public String hello(){
        return "helloworld";
    }
}
