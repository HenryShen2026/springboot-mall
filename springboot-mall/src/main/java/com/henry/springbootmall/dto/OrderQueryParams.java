package com.henry.springbootmall.dto;

import lombok.Data;

/**
 * ClassName: OrderQueryParams
 * Package: com.henry.springbootmall.dto
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/22 上午 12:49
 * @Version 1.0
 */
@Data
public class OrderQueryParams {

    private Integer userId;
    private Integer limit;
    private Integer offset;
}
