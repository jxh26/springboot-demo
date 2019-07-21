package com.minelan.mapper;

import com.minelan.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;

@Mapper
public interface TbUserMapper extends MyMapper<TbUser> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    TbUser selectByUsername(String username);
}