package com.ozcanpolat.gallerist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozcanpolat.gallerist.model.SaledCar;

@Repository
public interface SaledCarRepository extends JpaRepository<SaledCar, Long>{

}
