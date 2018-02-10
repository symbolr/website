package com.symbol.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.symbol.mapper.UserMapper;
import com.symbol.model.UserInfo;
@Service
public class UserInfoService {

    @Resource
    private UserMapper userInfoDao;
    
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
