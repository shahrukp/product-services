package com.example.product_services;

import org.bouncycastle.crypto.modes.G3413CBCBlockCipher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/v1/")
public class RestTemplate {


    // http://localhost:8080/rest/v1/ten

    @GetMapping("ten")
    public List<Integer> printTen() {
        List<Integer> list=new ArrayList<Integer>();
        int result = 0;
        for (int i = 0; i <= 5; i++) {
//            System.out.println("one to ten " +i);
            list.add(i);
        }
        return list;
    }
}
