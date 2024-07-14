package com.jspiders.roxilerassessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.roxilerassessment.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	List<Product> findByPrice(double price);

	@Query(value = "SELECT product FROM Product product WHERE product.title LIKE %:search% OR product.description LIKE %:search%")
	List<Product> findByTitleOrDescription(String search);

	@Query("SELECT p FROM Product p WHERE FUNCTION('MONTH', p.dateOfSale) = :month")
	List<Product> findProductsByMonth(int parseInt);
	
}
