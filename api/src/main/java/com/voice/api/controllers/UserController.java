package com.voice.api.controllers;

import com.voice.api.Dtos.UserInfo;
import com.voice.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.PUT)
    public int put(@RequestBody UserInfo userInfo) {
        return userService.add(userInfo);
    }

    @RequestMapping(method = RequestMethod.POST)
    public int post(@RequestBody List<UserInfo> userInfos) {
        return userService.add(userInfos);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public boolean login(@RequestParam String account, @RequestParam String password) {
        return userService.login(account, password);
    }
}
