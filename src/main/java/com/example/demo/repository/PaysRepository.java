package com.example.demo.repository;

import com.example.demo.model.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Integer> {
    
}
