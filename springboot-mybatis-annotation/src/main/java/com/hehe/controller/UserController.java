
package com.hehe.controller;

import com.hehe.mapper.UserMapper;
import com.hehe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User 控制器
 * @Name UserController
 * @Author zmm
 * @Created by 2019/3/8 0008
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    /**
     * 查询数据库 全部集合
     * @return
     */
    @GetMapping("list")
    public List<User> list() {
        return userMapper.list();
    }


    /**
     * 根据 用户名 查询 对象信息
     * @param username
     * @return
     */
    @GetMapping("list/{username}")
    public List<User> listByUsername(@PathVariable("username") String username) {
        return userMapper.listByUsername(username);
    }


    /**
     * 根据 用户名 和 密码 查询 对象信息
     * @param username
     * @param password
     * @return
     */
    @GetMapping("get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }


    /**
     *根据 用户名 和 密码 查询 对象信息  方法摒弃
     * @param username
     * @param password
     * @return
     */
    @GetMapping("get/bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}