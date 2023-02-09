package com.cg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
private int productCode;
private String productName;
private float price;
@OneToMany(mappedBy = "product")
private List<Review> reviewList;


public List<Review> getReviewList() {
	return reviewList;
}
public void setReviewList(List<Review> reviewList) {
	this.reviewList = reviewList;
}


public int getProductCode() {
	return productCode;
}
public void setProductCode(int productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
