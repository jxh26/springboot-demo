package com.minelan.common.service;

public interface BaseService<T,ID> {
    /**
     * 保存一个实体
     * @param t
     * @return
     */
    int add(T t);

    /**
     * 根据id删除一个实体
     * @param id
     * @return
     */
    int deleteById(ID id);

    /**
     * 根据主键更新实体
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);

    /**
     * 根据Id查找，只有一个结果
     * @param id
     * @return
     */
    T findOne(ID id);
}
