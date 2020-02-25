package com.hehe.controller;

import com.hehe.pojo.R;
import com.hehe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * User 控制器
 * @Name UserController
 * @Author zmm
 * @Created by 2019/3/8 0008
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询数据库 全部集合
     * @return
     */
    @GetMapping("list")
    public R list() {
        try {
           return R.isOk().data(userService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }
    }

    /**
     * 根据 用户名 查询 对象信息
     * @param username
     * @return
     */
    @GetMapping("list/{username}")
    public R listByName(@PathVariable("username")  String username) {
        try {
            return R.isOk().data(userService.findByUsername(username));
        } catch (Exception e) {
            return R.isFail(e);
        }
    }

    /**
     * 根据 用户Id 查询 对象信息
     * @param userId
     * @return
     */
    @GetMapping("get/{userId}")
    public R get(@PathVariable("userId") String userId) {
        try {
            return R.isOk().data(userService.get(userId));
        } catch (Exception e) {
            return R.isFail(e);
        }
    }

    /**
     * 根据 用户Id 删除 对象信息
     * @param userId
     * @return
     */
    @GetMapping("del/{userId}")
    public R delete(@PathVariable("userId") String userId) {
        try {
            return R.isOk().data(userService.delete(userId));
        } catch (Exception e) {
            return R.isFail(e);
        }
    }

}
