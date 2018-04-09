package com.yonghui.service;

import com.yonghui.bean.User;

public interface UserService {


    User login(User user);

    int register(User user);

    boolean isUsernameVaild(String username);

}
