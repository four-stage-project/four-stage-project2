package com.qp.service.impl;

import com.qp.dao.UserMapper;
import com.qp.pojo.User;
import com.qp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getTestData() {
        return userMapper.selectByPrimaryKey("12345");
    }
}
