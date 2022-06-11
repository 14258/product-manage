package com.example.productmanage.controller;

import com.example.productmanage.domain.User;
import com.example.productmanage.service.UserService;
import com.example.productmanage.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pub/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    JsonData register(@RequestBody User user){

        int link = userService.register(user);
        if(link==1) {
            return JsonData.buildSuccess("注册成功");
        }
        return JsonData.buildSuccess("注册失败");

    }

    @PostMapping("login")
    JsonData login(@RequestBody User user){

        String token = userService.login(user);
        if(token != null){
            return JsonData.buildSuccess(token);
        }
        return JsonData.buildSuccess("登录失败");

    }





}
