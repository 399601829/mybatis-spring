package org.mybatis.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.model.Product;

public interface ProductService {
	
	
	/**
	 * ��ѯ���е���Ʒ
	 * @return
	 */
	List<Product> listAllProduct();
	/**
	 * ������Ʒ����ѯ��Ʒ
	 * @return
	 */
	List<Product> listProductByCategoryid(@Param("categoryid")int categoryid);
	
	
	List<Product> listAllProductIncludeCategoryName();
	
	/**
	 * ������Ʒ
	 * @param product
	 */
	void insertProduct(Product product);
	
	
	
	void updateProduct(Product product);
	
	
	
	Product findProductById(int id);
	
	
	List<Product> like(String name);
	
	
	List<Product> page(int pageNumber,int pageSize);
	
	
	List<Product> dynaQuerySql(Product product);
	
}
