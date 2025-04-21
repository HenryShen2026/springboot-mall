package com.henry.springbootmall.service;

import com.henry.springbootmall.dto.CreateOrderRequest;
import com.henry.springbootmall.model.Order;

/**
 * ClassName: OrderService
 * Package: com.henry.springbootmall.service
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 10:50
 * @Version 1.0
 */
public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
