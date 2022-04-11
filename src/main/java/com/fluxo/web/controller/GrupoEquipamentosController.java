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

import com.fluxo.web.model.GrupoEquipamentos;
import com.fluxo.web.service.GrupoEquipamentosService;

@Controller
@ResponseBody
public class GrupoEquipamentosController {

	@Autowired
	GrupoEquipamentosService gruporEquipamentosService;
	
	//ESTE METODO FAZ UPDATE e CRIA.
	@RequestMapping(path = "/grupoequipamentosenxoval", method = RequestMethod.POST)
	public GrupoEquipamentos criarGrupoEquipamentos(@RequestBody GrupoEquipamentos grupoEquipamentosenxoval) {
		return gruporEquipamentosService.criarGrupoEquipamentos(grupoEquipamentosenxoval);
	}
	
	@RequestMapping(path = "/grupoequipamentosenxoval", method = RequestMethod.GET)
	public List<GrupoEquipamentos> bustarTodosGruposEquipamentos(){
		return gruporEquipamentosService.bustarTodosGruposEquipamentos();
	}
	
	@RequestMapping(path = "/grupoequipamentosenxoval/buscarGrupoEquipamentosPorId", method = RequestMethod.GET)
	public Optional<GrupoEquipamentos> buscarGrupoEquipamentosPorId(@PathParam("id") String id){
		return gruporEquipamentosService.buscarGrupoEquipamentosPorId(id);
	}
	
	@RequestMapping(path = "/grupoequipamentosenxoval/buscarGrupoEquipamentosPorDescricao", method = RequestMethod.GET)
	public List<GrupoEquipamentos> buscarGrupoEquipamentosPorDescricao(@PathParam("descricao") String descricao){
		return gruporEquipamentosService.buscarGrupoEquipamentosPorDescricao(descricao);
	}
}
