package com.cg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.ReviewDao;
import com.cg.entity.Review;
import com.cg.service.ReviewService;
@Component
@Transactional
public class ReviewServiceImpl  implements ReviewService{
	@Autowired
private ReviewDao reviewDao;
	@Override
	public Review addNewReviewService(Review r, int prodId) {
		return reviewDao.addNewReview(r, prodId);
	}

	@Override
	public List<Review> getReviewsByProdIdService(int prodId) {
		return reviewDao.getReviewsByProdId(prodId);
	}

}
