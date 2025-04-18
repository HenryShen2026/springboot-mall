package com.henry.springbootmall.service;

import com.henry.springbootmall.dto.ProductQueryParams;
import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;

import java.util.List;

/**
 * ClassName: ProductService
 * Package: com.henry.springbootmall.service
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/14 上午 10:46
 * @Version 1.0
 */
public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
