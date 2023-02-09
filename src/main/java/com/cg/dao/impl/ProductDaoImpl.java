package com.cg.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;
@Component
public class ProductDaoImpl implements ProductDao {
    @PersistenceContext
	private EntityManager em;
	@Override
	public Product addNewProduct(Product p) {
		em.persist(p); //persist in the DB
		return p;
	}
	@Override
	public Product searchProductByCode(int prodCode) {
		Product p =em.find(Product.class, prodCode);
		return p;
	}

	@Override
	public Product updateProduct(int prodCode, Product p) {
	Product product =em.find(Product.class, prodCode);
	if(product!=null) {
		product.setProductName(p.getProductName());
		product.setPrice(p.getPrice());
	}
		return product;
	}

	@Override
	public void removeProductByCode(int prodCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> allProducts() {
		String jpql="select p from Product p";
		Query q=em.createQuery(jpql);
		return q.getResultList();
	}

}
