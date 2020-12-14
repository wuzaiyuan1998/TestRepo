package com.icis.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.icis.pojo.User;
import com.icis.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    //引用远程服务
    @Reference
    private IUserService iUserService;
    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        System.out.println("调用远程服务  查询数据");
        return this.iUserService.getUserById(id);
    }
}
