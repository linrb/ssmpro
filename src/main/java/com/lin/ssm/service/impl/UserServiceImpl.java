package com.lin.ssm.service.impl;

import com.lin.ssm.entity.UserEntity;
import com.lin.ssm.mapper.UserEntityMapper;
import com.lin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    public List<UserEntity> getAllUsers() {
        return userEntityMapper.getAllUsers();
    }
}
