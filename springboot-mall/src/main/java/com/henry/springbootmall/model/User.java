package com.henry.springbootmall.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * ClassName: User
 * Package: com.henry.springbootmall.model
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/16 下午 03:04
 * @Version 1.0
 */
@Data
public class User {

    private Integer userId;
    private String email;
    @JsonIgnore
    private String password;
    private Date createdDate;
    private Date lastModifiedDate;
}
