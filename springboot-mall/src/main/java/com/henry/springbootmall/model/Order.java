package com.henry.springbootmall.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * ClassName: Order
 * Package: com.henry.springbootmall.model
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 10:45
 * @Version 1.0
 */
@Data
public class Order {

    private Integer orderId;
    private Integer userId;
    private Integer totalAmount;
    private Date createdDate;
    private Date lastModifiedDate;

    private List<OrderItem> orderItemList;
}
