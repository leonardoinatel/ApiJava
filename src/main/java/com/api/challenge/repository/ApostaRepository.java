package com.api.challenge.repository;

import com.api.challenge.model.Aposta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostaRepository extends JpaRepository<Aposta, Long> {
  
}
