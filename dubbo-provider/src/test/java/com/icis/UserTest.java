package com.icis;

import com.icis.pojo.User;
import com.icis.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =ApplicatonProvider8081.class )
public class UserTest {
    //注入Service
    @Autowired
    private IUserService userService;

    //测试
    @Test
    public void getUserById(){
       // System.out.println(userService);

        User user = userService.getUserById(24);
        System.out.println(user);

    }

}
