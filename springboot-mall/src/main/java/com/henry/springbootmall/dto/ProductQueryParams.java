package com.henry.springbootmall.dto;

import com.henry.springbootmall.constant.ProductCategory;
import lombok.Data;

/**
 * ClassName: ProductQueryParams
 * Package: com.henry.springbootmall.dto
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/15 上午 08:05
 * @Version 1.0
 */
@Data
public class ProductQueryParams {

    private ProductCategory category;
    private String search;

}
