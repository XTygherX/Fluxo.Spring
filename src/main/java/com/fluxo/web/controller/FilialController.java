package com.fluxo.web.controller;

import java.text.ParseException;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fluxo.web.model.Filial;
import com.fluxo.web.model.FilialUpdate;
import com.fluxo.web.service.FilialService;

@Controller
@ResponseBody
public class FilialController {

	@Autowired
	FilialService filialService;
	
	@RequestMapping(path = "/filial", method = RequestMethod.GET)
	public String innit(Model model) {
		model.addAttribute("filial", filialService.buscarTodasFiliais());
		return "filial/filiais";
	}


	@RequestMapping(path = "/filial/save", method = RequestMethod.POST)
	public Filial criarFilial(@RequestBody Filial filial) {
		return filialService.criarFilial(filial);
	}

	@RequestMapping(path = "/filial/atualizarFilial", method = RequestMethod.POST)
	public Integer atualizarFilial(@RequestBody FilialUpdate filial) {
		return filialService.atualizarFilial(filial);
	}

	@RequestMapping(path = "/filial/buscartodasfiliais", method = RequestMethod.GET)
	public List<Filial> buscarTodasFiliais() {
		return filialService.buscarTodasFiliais();
	}

	@RequestMapping(path = "/filial/buscaFilialPorNum", method = RequestMethod.GET)
	public List<Filial> buscaFilialPorNum(@PathParam("numero") String numero) {
		return filialService.buscarFilialrPorNum(numero);
	}

	@RequestMapping(path = "/filial/buscaFilialPorNome", method = RequestMethod.GET)
	public List<Filial> buscaFilialPorNome(@PathParam("nome") String nome) {
		return filialService.buscarFilialPorNome(nome);
	}

	@RequestMapping(path = "/filial/buscarFilialPorIntervalodDeDatas", method = RequestMethod.GET)
	public List<Filial> buscaFilialPorIntervaloDeDatas(@PathParam("dataMaior") String dataMaior,
			@PathParam("dataMenor") String dataMenor) throws ParseException {
		return filialService.buscarFilialPorIntervalodDeDatas(dataMaior, dataMenor);
	}
}
