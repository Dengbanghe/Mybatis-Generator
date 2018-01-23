package com.data.dao;

import com.data.model.UserEntity;

public interface UserDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(UserEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(UserEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    UserEntity selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(UserEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(UserEntity record);
}