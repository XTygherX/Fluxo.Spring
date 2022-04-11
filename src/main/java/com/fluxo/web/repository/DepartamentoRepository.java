package com.fluxo.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluxo.web.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, String> {
	List<Departamento> findByDescricao(String descricao);
}
