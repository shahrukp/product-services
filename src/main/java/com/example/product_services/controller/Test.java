package com.example.product_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/api/")
public class Test {


    // http://localhost:8888/product/api/message
    @GetMapping("message")
    public String testAPI(){
        return "product_services_response 9091--------2";
    }

    //http://localhost:9091/product/api/get/code
    @GetMapping("get/code")
    public  int code(){

        return 908;
    }

}
