package com.itc475.finalproject.mapper;

import com.itc475.finalproject.model.Review;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ReviewMapper {
    List<Review> findByProductId(Long productId);
    void insert(Review review);
}