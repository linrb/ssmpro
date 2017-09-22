package com.lin.ssm.service;

import com.lin.ssm.entity.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
