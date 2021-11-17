package com.linyue.service;

import com.linyue.entity.User;

public interface UserService {

    User checkUser(String username, String password);
}
