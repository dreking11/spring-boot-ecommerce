package com.ecommerce.casestudy.dao;

import com.ecommerce.casestudy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {
}
