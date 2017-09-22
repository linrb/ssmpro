package com.lin.ssm.controller;

import com.lin.ssm.entity.UserEntity;
import com.lin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public List<UserEntity> getAllUser()
    {
        List<UserEntity> list=userService.getAllUsers();
        return  list;
    }
}
