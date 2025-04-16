package com.henry.springbootmall.service;

import com.henry.springbootmall.dto.UserRegisterRequest;
import com.henry.springbootmall.model.User;

/**
 * ClassName: UserService
 * Package: com.henry.springbootmall.service
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/16 下午 03:08
 * @Version 1.0
 */
public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
