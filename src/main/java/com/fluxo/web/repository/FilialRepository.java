package com.fluxo.web.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fluxo.web.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {
	List<Filial> findByNomeFilial(String nomeFilial);

	List<Filial> findByNumFilial(String numFilial);

	List<Filial> findByDataInauguracaoLessThanAndDataInauguracaoGreaterThan(Date dataMaior, Date dataMenor);
	
	@Transactional
	@Modifying
	@Query("update filial set num_filial = :numFilialNovo, nome_filial = :nomeFilial, data_inauguracao = :dataInauguracao, data_inicio_recebimento = :dataRecebimento where num_filial = :numFilialAtual")
	Integer updateByNumFilial(
			@Param("numFilialNovo") String numFilialNovo,
			@Param("nomeFilial") String nomeFilial,
			@Param("dataInauguracao") Date dataInauguracao,
			@Param("dataRecebimento") Date dataRecebimento,
			@Param("numFilialAtual") String numFilialAtual);

}
