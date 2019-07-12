package com.minelan.console.service.impl;

import com.minelan.common.service.impl.BaseServiceImpl;
import com.minelan.console.service.UserService;
import com.minelan.entity.TbUser;
import com.minelan.mapper.TbUserMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<TbUser, Integer> implements UserService {

    @Resource
    private TbUserMapper userMapper;

    @Override
    public Mapper<TbUser> getMapper() {
        return userMapper;
    }
}
