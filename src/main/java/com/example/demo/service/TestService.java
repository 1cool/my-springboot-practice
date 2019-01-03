package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.exception.TestException;
import com.example.demo.model.UserModel;
import com.example.demo.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    UserDao userDao;

    public void test() {
        UserModel userModel = new UserModel();
        userModel.setName("我错了1");
        userModel.setMobile("asdasdas");
        userModel.setPassword(Md5Util.encodePassword("sadasdasdas"));
        userDao.save(userModel);

        throw new TestException("我错了");
    }

}
