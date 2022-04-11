package com.fluxo.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluxo.web.model.GrupoEquipamentos;
import com.fluxo.web.repository.GrupoEquipamentosRepository;

@Service
public class GrupoEquipamentosService {

	@Autowired
	GrupoEquipamentosRepository grupoEquipamentosRepository;
	
	public GrupoEquipamentos criarGrupoEquipamentos(GrupoEquipamentos grupoEquipamentos) {
		return grupoEquipamentosRepository.save(grupoEquipamentos);
	}
	
	public List<GrupoEquipamentos> bustarTodosGruposEquipamentos(){
		return grupoEquipamentosRepository.findAll();
	}
		
	public Optional<GrupoEquipamentos> buscarGrupoEquipamentosPorId(String id){
		return grupoEquipamentosRepository.findById(id);
	}
	
	public List<GrupoEquipamentos> buscarGrupoEquipamentosPorDescricao(String descricao){
		return grupoEquipamentosRepository.findByDescricao(descricao);
	}
}
