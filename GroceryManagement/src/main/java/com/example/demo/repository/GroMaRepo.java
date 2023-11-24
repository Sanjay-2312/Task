package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.GroMa;
@Repository
public interface GroMaRepo extends JpaRepository<GroMa, Integer>{
}