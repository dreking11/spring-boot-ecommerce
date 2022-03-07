package com.ecommerce.casestudy.dao;

import com.ecommerce.casestudy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
