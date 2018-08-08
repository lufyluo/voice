package com.voice.api.services;

import com.voice.api.Dtos.UserInfo;
import com.voice.api.repositories.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int add(UserInfo userInfo) {
        return userMapper.insert(userInfo);
    }

    @Override
    public int add(List<UserInfo> userInfos) {
        return userMapper.batchInsert(userInfos);
    }
}
