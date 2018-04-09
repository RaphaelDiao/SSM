package com.yonghui.controller;


import com.yonghui.bean.User;
import com.yonghui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String register( User user){

        int register = userService.register(user);

        System.out.println(register);


        return "/index.jsp";
    }

    @RequestMapping("/login")
    public String register(){

//        int register = userService.register(user);

        System.out.println();


        return "/index.jsp";
    }


}
