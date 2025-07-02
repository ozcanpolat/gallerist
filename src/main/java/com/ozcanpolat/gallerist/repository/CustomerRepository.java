package com.ozcanpolat.gallerist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozcanpolat.gallerist.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
