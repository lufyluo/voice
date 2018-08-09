package com.voice.api.services;

import com.voice.api.Dtos.UserInfo;

import java.util.List;

public interface UserService {
    int add(UserInfo userInfo);
    int add(List<UserInfo> userInfos);
    boolean login(String account,String password);
}
