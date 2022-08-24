package com.wei.demo01.service;

import com.wei.demo01.entity.UserBean;
import com.wei.demo01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    //将dao层属性注入service层
    @Resource
    private UserMapper userMapper;

    public UserBean LoginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }

    public void Insert(String name,String password){
        userMapper.saveInfo(name, password);
    }
}