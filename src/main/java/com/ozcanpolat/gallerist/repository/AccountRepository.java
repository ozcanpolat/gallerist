package com.ozcanpolat.gallerist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozcanpolat.gallerist.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
