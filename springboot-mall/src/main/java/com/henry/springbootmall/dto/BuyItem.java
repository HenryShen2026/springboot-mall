package com.henry.springbootmall.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * ClassName: BuyItem
 * Package: com.henry.springbootmall.dto
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/21 下午 11:10
 * @Version 1.0
 */
@Data
public class BuyItem {
    @NotNull
    private Integer productId;
    @NotNull
    private Integer quantity;
}
