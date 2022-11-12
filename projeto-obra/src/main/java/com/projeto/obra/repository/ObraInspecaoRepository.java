package com.projeto.obra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.obra.model.ObraInspecao;

public interface ObraInspecaoRepository extends JpaRepository <ObraInspecao, Integer> {
    
}
