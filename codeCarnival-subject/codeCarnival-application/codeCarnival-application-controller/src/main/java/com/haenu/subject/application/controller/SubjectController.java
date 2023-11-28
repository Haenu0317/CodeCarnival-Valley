package com.haenu.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题的Controller
 */
@RestController
public class SubjectController {
    @GetMapping("/test")
    public String test(){
        return  "yes";
    }

}
