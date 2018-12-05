package com.chen.dao;

import com.chen.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * @param userId
     * @return User
     */
    User selectUserById(Integer userId);
    List<User> queryUser(User user);

}