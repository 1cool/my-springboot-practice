package com.example.demo.exception;

import com.example.demo.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    BaseResponse defalutHandleException(Exception e) {
        LOGGER.error("Exception {}", e);
        return BaseResponse.error(-1, e.getMessage());
    }

    @ExceptionHandler(TestException.class)
    @ResponseBody
    BaseResponse testHandleException(TestException e) {
        LOGGER.error("TestException {}", e);
        return BaseResponse.error(-1111, e.getMessage());
    }
}
