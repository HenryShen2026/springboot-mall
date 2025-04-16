package com.henry.springbootmall.dao;

import com.henry.springbootmall.dto.UserRegisterRequest;
import com.henry.springbootmall.model.User;

/**
 * ClassName: UserDao
 * Package: com.henry.springbootmall.dao
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/16 下午 03:07
 * @Version 1.0
 */
public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
