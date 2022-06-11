package com.example.productmanage.service.impl;

import com.example.productmanage.domain.User;
import com.example.productmanage.mapper.UserMapper;
import com.example.productmanage.service.UserService;
import com.example.productmanage.utils.CommonUtils;
import com.example.productmanage.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int register(User user) {

        User userNew = new User();
        String pwd = CommonUtils.MD5(user.getPwd());
        userNew.setPwd(pwd);
        userNew.setName(user.getName());

        return userMapper.save(userNew);
    }

    @Override
    public String login(User user) {

        User userNew = new User();
        String pwd = CommonUtils.MD5(user.getPwd());
        userNew.setPwd(pwd);
        userNew.setName(user.getName());
        System.out.println(userNew);

        User userNext = userMapper.findByNameAndPwd(userNew);
        if(userNext != null){
            String token = JWTUtils.geneJsonWebToken(userNext);
            return token;
        }else {
            return null;
        }


    }


}
