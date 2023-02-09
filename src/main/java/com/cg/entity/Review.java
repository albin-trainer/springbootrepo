package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
private int revId;
private String reviewerName;
private String content;
private float ratings;
@ManyToOne
@JoinColumn(name="prodId")
private Product product;



public int getRevId() {
	return revId;
}
public void setRevId(int revId) {
	this.revId = revId;
}
public String getReviewerName() {
	return reviewerName;
}
public void setReviewerName(String reviewerName) {
	this.reviewerName = reviewerName;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}


}
