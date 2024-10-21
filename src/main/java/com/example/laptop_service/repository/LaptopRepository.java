package com.example.laptop_service.repository;

import com.example.laptop_service.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
