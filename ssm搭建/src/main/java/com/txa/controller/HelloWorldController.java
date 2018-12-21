package com.txa.controller;

import com.txa.domain.User;
import com.txa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
class HelloWorldController {
    @Resource
    UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public void userList() {
        User user = new User();
        user.setId("1dasdas56789");
        user.setName("123");
        user.setSex("123");
        user.setAge(123);
        userService.insertUser(user);
        System.out.println("success");
    }
}

