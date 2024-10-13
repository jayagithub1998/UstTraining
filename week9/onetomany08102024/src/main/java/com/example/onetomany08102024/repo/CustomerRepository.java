package com.example.onetomany08102024.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany08102024.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long> {

}
