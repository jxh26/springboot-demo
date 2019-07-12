package com.minelan.controller;

import com.minelan.console.service.UserService;
import com.minelan.entity.TbUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    /**
     * 查询一个用户
     * @param id
     * @return
     */
    @GetMapping(value = "/queryOne")
    public TbUser queryUser(Integer id){
        return userService.findOne(id);
    }
}
