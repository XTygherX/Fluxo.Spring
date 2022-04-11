package com.fluxo.web.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fluxo.web.model.Departamento;
import com.fluxo.web.service.DepartamentoService;

@Controller
@ResponseBody
public class DepartamentoController {

	@Autowired
	DepartamentoService departamentoService;
	
	//ESTE METODO FAZ UPDATE e CRIA.
	@RequestMapping(path = "/departamento", method = RequestMethod.POST)
	public Departamento criarDepartamento(@RequestBody Departamento departamento) {
		
		return departamentoService.criarDepartamento(departamento);
	}
	
	@RequestMapping(path = "/departamento", method = RequestMethod.GET)
	public List<Departamento> buscarDepartamentoPorID() {		
		return departamentoService.buscarTodosDepartamentos();
	}
	
	@RequestMapping(path = "/departamento/buscarDepartamentoPorID", method = RequestMethod.GET)
	public Optional<Departamento> buscarDepartamentoPorID(@PathParam("id") String id){
		return departamentoService.buscarDepartamentoPorID(id);
	}
	
	@RequestMapping(path = "/departamento/buscarDepartamentoPorDescricao", method = RequestMethod.GET)
	public List<Departamento> buscarDepartamentoPorDescricao(@PathParam("descricao") String descricao){
		return departamentoService.buscarDepartamentoPorDescricao(descricao);
	}
}
