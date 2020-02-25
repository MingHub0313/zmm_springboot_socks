package com.hehe.service;

import com.hehe.pojo.User;
import java.util.List;

/**
 * User 服务层 接口
 * @Name UserService
 * @Author zmm
 * @Created by 2019/3/8 0008
 */
public interface UserService {

    /**
     * 查询数据库 全部集合
     * @return
     */
    List<User> list();

    /**
     * 根据 用户名 查询 对象信息
     * @param username
     * @return
     */
    List<User> findByUsername(String username);

    /**
     * 根据 用户Id 查询 对象信息
     * @param userId
     * @return
     */
    User get(String userId);


    /**
     * 根据 用户Id 删除 对象信息
     * @param userId
     * @return
     */
    int delete(String userId);

}
