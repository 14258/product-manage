package com.example.productmanage.service;

import com.example.productmanage.domain.User;

public interface UserService {
    int register(User user);

    String login(User user);
}
