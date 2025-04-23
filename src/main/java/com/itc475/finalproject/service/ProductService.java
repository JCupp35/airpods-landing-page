package com.itc475.finalproject.service;

import com.itc475.finalproject.mapper.ProductMapper;
import com.itc475.finalproject.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> getAllProducts() {
        return productMapper.findAll();
    }

    public Product getProductById(Long id) {
        return productMapper.findById(id);
    }

    public void addProduct(Product product) {
        productMapper.insert(product);
    }
}