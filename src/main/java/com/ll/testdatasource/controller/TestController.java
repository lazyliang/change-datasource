package com.ll.testdatasource.controller;

import com.ll.testdatasource.mapper.UserInfoMapper;
import com.ll.testdatasource.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ll on 2018/7/23.
 */
@RestController
public class TestController {
    @Autowired
    UserInfoMapper userInfoMapper;
    @RequestMapping("/getOne")
    public UserInfo getOne(int id){
       return userInfoMapper.selectByEvenUserId(id);
    }

    @RequestMapping("/getTwo")
    public UserInfo getTwo(int id){
        return userInfoMapper.selectByOddUserId(id);
    }
}
