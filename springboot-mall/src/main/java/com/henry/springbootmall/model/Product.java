package com.henry.springbootmall.model;

import com.henry.springbootmall.constant.ProductCategory;
import lombok.Data;

import java.util.Date;

/**
 * ClassName: Product
 * Package: com.henry.springbootmall.model
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/14 上午 10:19
 * @Version 1.0
 */
@Data
public class Product {

    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Date createdDate;
    private Date lastModifiedDate;

}
