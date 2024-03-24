package com.springboot.project1.controller;

import com.springboot.project1.service.MyService;
import com.springboot.project1.service.MyServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoDIController {

    private MyService service = new MyServiceImpl();

    @GetMapping("/no-di/hello")
    public String getHello() {
        return service.getHello();
    }

}
