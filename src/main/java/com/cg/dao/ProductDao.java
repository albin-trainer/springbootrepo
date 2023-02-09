package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDao {
Product addNewProduct(Product p);
Product searchProductByCode(int prodCode);
Product updateProduct(int prodCode,Product p);
void removeProductByCode(int prodCode);
List<Product> allProducts();

}
