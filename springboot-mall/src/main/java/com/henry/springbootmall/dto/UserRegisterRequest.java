package com.henry.springbootmall.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * ClassName: UserRegisterRequest
 * Package: com.henry.springbootmall.dto
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/16 下午 03:14
 * @Version 1.0
 */
@Data
public class UserRegisterRequest {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
}
