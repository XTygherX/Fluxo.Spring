package com.fluxo.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fluxo.web.model.Equipamentos;

@Repository
public interface EquipamentosRepository extends JpaRepository<Equipamentos, String>{
	String select = "";
	
	@Transactional
	@Modifying
	@Query("select e.codigo, e.descricao, d.descricao, ge.descricao from equipamentos e "
			+ "inner join departamento d "
			+ "on e.departamento_id  =  d.id "
			+ "inner join grupo_equipamentos ge "
			+ "on e.grupoequipamentos_id = ge.id")
	List<?> buscaTodosEquipamentosSimples();
}
