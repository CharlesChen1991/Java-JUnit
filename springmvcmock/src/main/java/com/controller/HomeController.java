package com.controller;

import com.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
@RestController
public class HomeController {

    @Autowired
    public SayHelloService service;

    @RequestMapping("/")
    public ResponseEntity greeting() {
        return ResponseEntity.ok(service.sayHello());
    }

}
