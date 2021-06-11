package com.agu.gestaoescalabackend.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pauta")
public class PautaDeAudiencia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private LocalTime hora;
	private String sala;
	private String processo;
	
	@Column(name = "nome_parte")
	private String nomeParte;
	private String cpf;
	
	@Column(name = "nome_advogado")
	private String nomeAdvogado;
	private String objeto;
	
	@ManyToOne
	@JoinColumn(name = "procurador_id")
	private Procurador procurador;
	
	
	public PautaDeAudiencia() {
	}

	public PautaDeAudiencia(Long id, LocalDate data, LocalTime hora, String sala, String processo, String nomeParte,
			String cpf, String nomeAdvogado, String objeto, Procurador procurador) {
		super();
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.sala = sala;
		this.processo = processo;
		this.nomeParte = nomeParte;
		this.cpf = cpf;
		this.nomeAdvogado = nomeAdvogado;
		this.objeto = objeto;
		this.procurador = procurador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getNomeParte() {
		return nomeParte;
	}

	public void setNomeParte(String nomeParte) {
		this.nomeParte = nomeParte;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeAdvogado() {
		return nomeAdvogado;
	}

	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeAdvogado = nomeAdvogado;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public Procurador getProcurador() {
		return procurador;
	}

	public void setProcurador(Procurador procurador) {
		this.procurador = procurador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeAdvogado == null) ? 0 : nomeAdvogado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PautaDeAudiencia other = (PautaDeAudiencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeAdvogado == null) {
			if (other.nomeAdvogado != null)
				return false;
		} else if (!nomeAdvogado.equals(other.nomeAdvogado))
			return false;
		return true;
	}

	
}
