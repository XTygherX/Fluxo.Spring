package com.fluxo.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluxo.web.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	List<Usuario> findByMatricula(String matricula);
	List<Usuario> findByNome(String nome);
	List<Usuario> findByUsuarioAtivo(Boolean usuarioAtivo);
	
	
}
