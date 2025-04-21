package com.henry.springbootmall.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 * ClassName: CreateOrderRequest
 * Package: com.henry.springbootmall.dto
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 11:09
 * @Version 1.0
 */
@Data
public class CreateOrderRequest {

    @NotEmpty
    private List<BuyItem> buyItemList;
}
