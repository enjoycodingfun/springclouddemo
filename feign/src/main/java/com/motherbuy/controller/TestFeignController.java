package com.motherbuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.motherbuy.BasePojo;
import com.motherbuy.ChildPojo;
import com.motherbuy.interfaces.ApiService;

@RestController
public class TestFeignController {
    @Value("${server.port}")
    private int port;
    @Autowired
    private ApiService apiService;
    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
    @RequestMapping("test")
    public String testPojoParam(@RequestBody BasePojo basePojo){
        return apiService.testPojoParam(basePojo);
    }
    @RequestMapping("testMultiParam")
    public String testMultiParam(@RequestParam("basePojo") BasePojo basePojo,@RequestParam("childPojo")ChildPojo childPojo){
        return apiService.testPojoParam(basePojo);
    }
}
