package com.fluxo.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluxo.web.model.Departamento;
import com.fluxo.web.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	public Departamento criarDepartamento(Departamento departamento){
		return departamentoRepository.save(departamento);
	}
	
	public List<Departamento> buscarTodosDepartamentos(){
		return departamentoRepository.findAll();
	}
	
	public Optional<Departamento> buscarDepartamentoPorID(String id){
		return departamentoRepository.findById(id);
	}
	
	public List<Departamento> buscarDepartamentoPorDescricao(String descricao){
		return departamentoRepository.findByDescricao(descricao);
	}
}
