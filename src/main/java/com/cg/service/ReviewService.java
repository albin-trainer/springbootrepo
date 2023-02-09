package com.cg.service;

import java.util.List;

import com.cg.entity.Review;

public interface ReviewService {
	Review addNewReviewService(Review r, int prodId);
	List<Review> getReviewsByProdIdService(int prodId);
}
