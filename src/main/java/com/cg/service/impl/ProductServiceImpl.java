package com.cg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;
import com.cg.exception.ProductNotFoundException;
import com.cg.service.ProductService;
@Component
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
private ProductDao productDao;
	@Override
	public Product addNewProductService(Product p) {
		return productDao.addNewProduct(p);
	}
	@Override
	public Product searchProductByCodeService(int prodCode) {
		Product p = productDao.searchProductByCode(prodCode);
		if(p==null) {
			throw new ProductNotFoundException("The product code "+prodCode+" not found");
		}
		return p;
	}
	@Override
	public Product updateProductService(int prodCode,Product p) {
		return productDao.updateProduct(prodCode, p);
	}
	@Override
	public void removeProductByCodeService(int prodCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> allProductsService() {
		// TODO Auto-generated method stub
		return productDao.allProducts();
	}

}
