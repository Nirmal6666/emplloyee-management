package com.example.employeemanagement.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @GetMapping("/hello-world")
    public String helloworld() {
        return "Hello World";
    }
}
