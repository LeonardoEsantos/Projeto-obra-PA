package com.projeto.obra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.obra.model.Inspecao;

public interface InspecaoRepository extends JpaRepository<Inspecao, Integer> {
    
}
