package com.txa.service.impl;

import com.txa.dao.UserDao;
import com.txa.domain.User;
import com.txa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
