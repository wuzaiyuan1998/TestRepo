package com.icis.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.icis.mapper.UserMapper;
import com.icis.pojo.User;
import com.icis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
// 把服务放到本地  8081容器下
//@Service("userService")
//把当前服务  放入到注册中心
@Service
public class IUserServiceImpl implements IUserService{
    //注入Mapper
    @Autowired
    private UserMapper userMapper;
    public User getUserById(Integer uid) {
        return userMapper.getUserById(uid);
    }
}
