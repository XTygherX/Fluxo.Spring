package com.fluxo.web.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fluxo.web.model.Usuario;
import com.fluxo.web.service.UsuarioService;

@Controller
@ResponseBody
public class UsuarioController {
	

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(path ="/usuario", method = RequestMethod.POST)
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.criarUsuario(usuario);
	}
	
	@RequestMapping(path ="/usuario", method = RequestMethod.GET)
	public List<Usuario> buscarTodosUsuarios(){
		return usuarioService.buscarTodosUsuarios();
	}
	
	@RequestMapping(path ="/usuario/buscarUsuarioPorMatricula", method = RequestMethod.GET)
	public List<Usuario> buscarUsuarioPorMatricula(@PathParam("matricula") String matricula) {
		return usuarioService.buscarUsuarioPorMatricula(matricula);
	}
	
	@RequestMapping(path ="/usuario/buscarUsuarioPorNome", method = RequestMethod.GET)
	public List<Usuario> buscarUsuarioPorNome(@PathParam("nome") String nome) {
		return usuarioService.buscarUsuarioPorNome(nome);
	}
	
	@RequestMapping(path ="/usuario/buscarUsuarioStatus", method = RequestMethod.GET)
	public List<Usuario> buscarUsuarioStatus(@PathParam("status") Boolean status) {
		return usuarioService.buscarUsuarioStatus(status);
	}
	
}
