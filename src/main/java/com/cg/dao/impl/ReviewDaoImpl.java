package com.cg.dao.impl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import com.cg.dao.ReviewDao;
import com.cg.entity.Product;
import com.cg.entity.Review;
@Component
public class ReviewDaoImpl implements ReviewDao{
	@PersistenceContext
	private EntityManager em;
	
	public Review addNewReview(Review r, int prodId) {
		System.out.println("prodId "+prodId);
		Product p=em.find(Product.class, prodId);
		if(p!=null) {
			r.setProduct(p);
			em.persist(r);
		}
		return r;
	}
	public List<Review> getReviewsByProdId(int prodId) {
	//Product p=em.find(Product.class,prodId);
		//Its  a sql query not JPQL query .....
	String sql="select * from review where prod_id =:id";
	Query q=em.createNativeQuery(sql);
	q.setParameter("id", prodId);
	List<Review> list=q.getResultList();
		return list;
	}

}
