package com.fluxo.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluxo.web.model.Usuario;
import com.fluxo.web.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario criarUsuario(Usuario usuario) {
		if(usuarioRepository.findByMatricula(usuario.getMatricula()).size() > 0){
			throw new RuntimeException("Ja existe uma usuario com esta matricula");
		}else {
			return usuarioRepository.save(usuario);
		}		
		
	}
	
	public List<Usuario> buscarTodosUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public List<Usuario> buscarUsuarioPorMatricula(String matricula) {
		return usuarioRepository.findByMatricula(matricula);
	}
	
	public List<Usuario> buscarUsuarioPorNome(String nome) {
		return usuarioRepository.findByNome(nome);
	}
	
	public List<Usuario> buscarUsuarioStatus(Boolean status) {
		return usuarioRepository.findByUsuarioAtivo(status);
	}
}
