package com.chen.service;

import com.chen.entity.User;

import java.util.List;

public interface UserService {
    User selectUserById(Integer userId);
    User queryUser(User user);
}