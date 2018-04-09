package com.yonghui.service.impl;

import com.yonghui.bean.User;
import com.yonghui.dao.UserDao;
import com.yonghui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceimpl implements UserService{


    @Autowired
    UserDao userdao;

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public int register(User user) {

        int insert = userdao.insert(user);

        return insert;
    }

    @Override
    public boolean isUsernameVaild(String username) {
        return false;
    }
}
