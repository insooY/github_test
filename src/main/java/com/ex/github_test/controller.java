package com.ex.github_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/")
    public String index(){
        return "To-do Application !";
    }
}
