package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    UserDao userDao;

    public List<UserModel> test() {
        return userDao.findAll();
    }

}
