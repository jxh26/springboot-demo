package com.minelan.console.service;

import com.minelan.common.service.BaseService;
import com.minelan.entity.TbUser;

public interface UserService extends BaseService<TbUser,Integer> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    TbUser selectByUsername(String username);
}
