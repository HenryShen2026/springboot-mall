package com.henry.springbootmall.dao;

import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;

/**
 * ClassName: ProductDao
 * Package: com.henry.springbootmall.dao
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/14 上午 10:25
 * @Version 1.0
 */
public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
