package com.itc475.finalproject.mapper;

import com.itc475.finalproject.model.Product;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    Product findById(Long id);
    void insert(Product product);
}