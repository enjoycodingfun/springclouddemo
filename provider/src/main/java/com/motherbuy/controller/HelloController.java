package com.motherbuy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.motherbuy.BasePojo;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口：程序============";
    }
    @RequestMapping("testPojoParam")
    public String testPojoParam(@RequestBody BasePojo basePojo){
        return basePojo.toString();
    }
}
