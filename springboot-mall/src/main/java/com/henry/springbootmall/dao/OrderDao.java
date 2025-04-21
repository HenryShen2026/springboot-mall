package com.henry.springbootmall.dao;

import com.henry.springbootmall.model.OrderItem;

import java.util.List;

/**
 * ClassName: OrderDao
 * Package: com.henry.springbootmall.dao
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 10:49
 * @Version 1.0
 */
public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
