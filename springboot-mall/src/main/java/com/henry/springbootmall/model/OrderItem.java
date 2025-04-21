package com.henry.springbootmall.model;

import lombok.Data;

/**
 * ClassName: OrderItem
 * Package: com.henry.springbootmall.model
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 10:47
 * @Version 1.0
 */
@Data
public class OrderItem {

    private Integer orderItemId;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private Integer amount;

    private String productName;
    private String imageUrl;

}
