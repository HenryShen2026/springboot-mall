package com.henry.springbootmall.controller;

import com.henry.springbootmall.dto.CreateOrderRequest;
import com.henry.springbootmall.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderController
 * Package: com.henry.springbootmall.controller
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 10:52
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Order 功能附屬在 User 底下，故url設計如下
    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable Integer userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest) {

        Integer orderId = orderService.createOrder(userId, createOrderRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(orderId);
    }
}
