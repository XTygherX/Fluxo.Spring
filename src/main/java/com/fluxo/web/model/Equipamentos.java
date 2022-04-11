package com.fluxo.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "equipamentos")
@Table
public class Equipamentos {

	@Id
	@Column
	private String codigo;
	@Column
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "grupoequipamentos_id")
	private GrupoEquipamentos grupoequipamentos_id;
		
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento_id;
	

}
