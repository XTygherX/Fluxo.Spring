package com.fluxo.web.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FilialUpdate {

	private String numFilial;
	private String nomeFilial;
	@Temporal(TemporalType.DATE)
	private Date dataInicioRecebimento;
	@Temporal(TemporalType.DATE)
	private Date dataInauguracao;
	private String numFilialAtual;
}
