package com.qp.controller;

import com.qp.pojo.User;
import com.qp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public User TestCon() {
        return testService.getTestData();
    }
}
