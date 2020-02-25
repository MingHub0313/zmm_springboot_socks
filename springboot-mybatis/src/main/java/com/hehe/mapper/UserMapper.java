package com.hehe.mapper;

import com.hehe.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * UserMapper
 * @Name UserMapper
 * @Author zmm
 * @Created by 2019/3/8 0008
 */
public interface UserMapper {

    /**
     * 查询数据库 全部集合
     * @return
     */
    @Select("select * from t_user where 1=1")
    List<User> list();

    /**
     * 根据 用户名 查询 对象信息
     * @param username
     * @return
     */
    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);


    /**
     * 根据 用户Id 查询 对象信息
     * @param userId
     * @return
     */
    @Select("select * from t_user where user_id like #{userId}")
    User getOne(String userId);


    /**
     * 根据 用户Id 删除 对象信息
     * @param userId
     * @return
     */
    @Delete("delete from t_user where user_id like #{userId}")
    int delete(String userId);

}
