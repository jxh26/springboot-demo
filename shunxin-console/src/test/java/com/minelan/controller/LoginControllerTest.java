package com.minelan.controller;

import com.minelan.vo.ResultMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    @Test
    public void login() {
        ResultMap resultMap = loginController.login("admin","admin");
        System.out.println("登录"+resultMap.toString());
    }
}