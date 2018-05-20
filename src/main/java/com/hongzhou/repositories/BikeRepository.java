package com.hongzhou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongzhou.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
