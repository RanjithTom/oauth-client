package com.example.oauthclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

    @GetMapping(value="/getEmployees")
    public ModelAndView getEmployeeInfo() {
        return new ModelAndView("getEmployees");
    }

}
