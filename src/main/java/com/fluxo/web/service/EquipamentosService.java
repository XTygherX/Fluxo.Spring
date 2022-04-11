package com.fluxo.web.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluxo.web.model.Equipamentos;
import com.fluxo.web.repository.EquipamentosRepository;

@Service
public class EquipamentosService {

	@Autowired
	EquipamentosRepository equipamentosRepository;
	
	public Equipamentos criarEquipamento(Equipamentos equipamentos){
		return equipamentosRepository.save(equipamentos);
	}
	
	public List<Equipamentos> buscarTodosEquipamentosDetalhes(){
		return equipamentosRepository.findAll();
	}
	
	public List<?> buscarTodosEquipamentosSimples(){
		return equipamentosRepository.buscaTodosEquipamentosSimples();
	}
}
