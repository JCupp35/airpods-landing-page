package com.itc475.finalproject.service;

import com.itc475.finalproject.mapper.ReviewMapper;
import com.itc475.finalproject.model.Review;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewMapper reviewMapper;

    public ReviewService(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    public List<Review> getReviewsByProductId(Long productId) {
        return reviewMapper.findByProductId(productId);
    }

    public void addReview(Review review) {
        reviewMapper.insert(review);
    }
}