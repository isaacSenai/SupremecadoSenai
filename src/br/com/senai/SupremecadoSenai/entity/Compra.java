package br.com.senai.SupremecadoSenai.entity;

import java.time.LocalDate;

public class Compra {

	private Integer id;
	
	private LocalDate dataDeMovimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataDeMovimento() {
		return dataDeMovimento;
	}

	public void setDataDeMovimento(LocalDate dataDeMovimento) {
		this.dataDeMovimento = dataDeMovimento;
	}
	
	
}
