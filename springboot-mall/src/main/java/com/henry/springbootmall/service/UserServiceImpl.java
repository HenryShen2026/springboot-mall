package com.henry.springbootmall.service;

import com.henry.springbootmall.dao.UserDao;
import com.henry.springbootmall.dto.UserRegisterRequest;
import com.henry.springbootmall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserServiceImpl
 * Package: com.henry.springbootmall.service
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/16 下午 03:08
 * @Version 1.0
 */
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
