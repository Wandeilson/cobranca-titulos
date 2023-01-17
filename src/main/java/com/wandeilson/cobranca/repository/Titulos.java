package com.wandeilson.cobranca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandeilson.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

	 public List<Titulo> findByDescricaoContaining(String descricao);
}
