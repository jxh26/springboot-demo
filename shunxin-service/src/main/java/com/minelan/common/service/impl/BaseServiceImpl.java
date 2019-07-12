package com.minelan.common.service.impl;

import com.minelan.common.service.BaseService;
import tk.mybatis.mapper.common.Mapper;

public abstract class BaseServiceImpl<T,ID> implements BaseService<T, ID> {


    public abstract Mapper<T> getMapper();

    @Override
    public int add(T t) {
        return getMapper().insert(t);
    }

    @Override
    public int deleteById(ID id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return getMapper().updateByPrimaryKey(t);
    }

    @Override
    public T findOne(ID id) {
        return getMapper().selectByPrimaryKey(id);
    }
}
