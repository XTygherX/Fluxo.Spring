package com.fluxo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fluxo.web.model.Equipamentos;
import com.fluxo.web.service.EquipamentosService;

@Controller
@ResponseBody
public class EquipamentosController {
	@Autowired
	EquipamentosService equipamentosService;
	
	@RequestMapping(path = "/equipamentos", method = RequestMethod.POST)
	public Equipamentos criarEquipamento(@RequestBody Equipamentos equipamentos) {
		return equipamentosService.criarEquipamento(equipamentos);
	}
	//Busca Detalhada
	@RequestMapping(path = "/equipamentos", method = RequestMethod.GET)
	public List<?> buscarTodosEquipamentosDetalhes(){
		return equipamentosService.buscarTodosEquipamentosDetalhes();
	}
	
	@RequestMapping(path = "/equipamentos/buscarTodosEquipamentosSimples", method = RequestMethod.GET)
	public List<?> buscarTodosEquipamentosSimples(){
		return equipamentosService.buscarTodosEquipamentosSimples();
	}
	
}
