package com.fluxo.web.service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluxo.web.model.Filial;
import com.fluxo.web.model.FilialUpdate;
import com.fluxo.web.repository.FilialRepository;

@Service
public class FilialService {

	@Autowired
	FilialRepository filialRepository;

	public Filial criarFilial(Filial filial) {
		if (filialRepository.findByNumFilial(filial.getNumFilial()).size() > 0) {
			throw new RuntimeException("Ja existe uma filial com este nome");
		} else if (filialRepository.findByNomeFilial(filial.getNomeFilial()).size() > 0) {
			throw new RuntimeException("Ja existe uma filial com este nome");
		} else {
			return filialRepository.save(filial);
		}
	}

	public Integer atualizarFilial(FilialUpdate filial) {
		if (filialRepository.findByNomeFilial(filial.getNumFilial()) != null) {
			return filialRepository.updateByNumFilial(filial.getNumFilial(), filial.getNomeFilial(),
					filial.getDataInauguracao(), filial.getDataInicioRecebimento(), filial.getNumFilialAtual());
		} else {
			return null;
		}

	}

	public List<Filial> buscarTodasFiliais() {
		return filialRepository.findAll();
	}

	public List<Filial> buscarFilialPorNome(String nome) {
		return filialRepository.findByNomeFilial(nome);
	}

	public List<Filial> buscarFilialrPorNum(String numero) {
		return filialRepository.findByNumFilial(numero);
	}

	public List<Filial> buscarFilialPorIntervalodDeDatas(String dataMaior, String dataMenor) throws ParseException {
		// Faz a conversão de forma que o JPA entenda o formato da data e busca
		// informações no banco
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date dMaior = new Date(fmt.parse(dataMaior).getTime());
		Date dMenor = new Date(fmt.parse(dataMenor).getTime());
		return filialRepository.findByDataInauguracaoLessThanAndDataInauguracaoGreaterThan(dMaior, dMenor);
	}

}
