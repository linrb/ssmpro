package com.lin.ssm.mapper;

import com.lin.ssm.entity.UserEntity;

import java.util.List;

public interface UserEntityMapper {

    /**
     * 查找所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
