package com.cg.dao;

import java.util.List;

import com.cg.entity.Review;

public interface ReviewDao {
//what are the data required to add review
	//reviewer name, content, rating and prodId
	Review addNewReview(Review r, int prodId);
	
	//to retrive all reviews of a product what data required
	 //prod id
	List<Review> getReviewsByProdId(int prodId);
}
