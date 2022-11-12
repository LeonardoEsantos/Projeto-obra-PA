package com.projeto.obra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.obra.model.Obra;

public interface ObraRepository extends JpaRepository<Obra, Integer> {
    
}
