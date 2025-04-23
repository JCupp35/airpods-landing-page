package com.itc475.finalproject.controller;

import com.itc475.finalproject.model.Review;
import com.itc475.finalproject.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/review")
    public String submitReview(@ModelAttribute Review review, @RequestParam Long productId) {
        review.setProductId(productId);
        reviewService.addReview(review);
        return "redirect:/product/" + productId;
    }
}