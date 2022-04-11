package com.fluxo.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluxo.web.model.GrupoEquipamentos;

@Repository
public interface GrupoEquipamentosRepository extends JpaRepository<GrupoEquipamentos, String>{
	List<GrupoEquipamentos> findByDescricao(String descricao);

}
