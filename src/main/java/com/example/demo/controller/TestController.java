package com.example.demo.controller;

import com.example.demo.response.BaseResponse;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public BaseResponse index() {
        testService.test();

        return BaseResponse.success(1);
    }
}
