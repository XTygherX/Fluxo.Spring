package com.fluxo.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "departamento")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"descricao","id"})})
public class Departamento {
	@Id
	@Column
	private String id;
	@Column
	private String descricao;
	

	
}
