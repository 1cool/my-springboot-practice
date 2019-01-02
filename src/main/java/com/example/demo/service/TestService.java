package com.example.demo.service;

import com.example.demo.exception.TestException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void test() {
        throw new TestException("我错了");
    }

}
