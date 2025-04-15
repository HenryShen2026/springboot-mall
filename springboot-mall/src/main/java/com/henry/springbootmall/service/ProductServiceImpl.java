package com.henry.springbootmall.service;

import com.henry.springbootmall.dao.ProductDao;
import com.henry.springbootmall.dto.ProductQueryParams;
import com.henry.springbootmall.dto.ProductRequest;
import com.henry.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName: ProductServiceImpl
 * Package: com.henry.springbootmall.service
 * Description:
 *
 * @Author Henry Shen
 * @Create 2025/4/14 上午 10:46
 * @Version 1.0
 */
@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
