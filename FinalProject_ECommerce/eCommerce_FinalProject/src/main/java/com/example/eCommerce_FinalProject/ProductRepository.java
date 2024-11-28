package com.example.eCommerce_FinalProject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository <Product,Integer> {
	
	@Query("SELECT w FROM Product w WHERE w.Product_name like %:pname%")
	Product getProduct(@Param("pname") String str);
	
}
