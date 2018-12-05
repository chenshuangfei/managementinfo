package com.chen.service;

import com.chen.UserTest;
import com.chen.entity.User;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends UserTest {
    @Autowired
    private UserService userService;
    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(1);
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}