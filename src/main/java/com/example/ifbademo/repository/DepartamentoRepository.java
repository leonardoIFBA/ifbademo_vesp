package com.example.ifbademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ifbademo.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
    
}
