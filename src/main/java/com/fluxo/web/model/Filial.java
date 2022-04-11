package com.fluxo.web.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "filial")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"numFilial"})})
public class Filial {

	@Id
	@Column
	private String numFilial;
	@Column 
	private String nomeFilial;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataInicioRecebimento;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataInauguracao;
	
}