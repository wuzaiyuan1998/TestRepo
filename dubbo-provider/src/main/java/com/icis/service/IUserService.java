package com.icis.service;

import com.icis.pojo.User;

public interface IUserService {
    //根据用户id 查询用户
    public User getUserById(Integer uid);
}
