package com.agu.gestaoescalabackend.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_procuradores")
public class Procurador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_procurador")
	private String nomeProcurador;
	private String status;
	@Column(name = "data_inicial")
	private LocalDate dataInicial;
	@Column(name = "data_final")
	private LocalDate dataFinal;
	private String grupo;
	
	@OneToMany(mappedBy = "procurador")
	private List<PautaDeAudiencia> pautas = new ArrayList<>();

	public Procurador() {
	}

	public Procurador(Long id, String nomeProcurador, String status, LocalDate dataInicial, LocalDate dataFinal,
			String grupo) {
		super();
		this.id = id;
		this.nomeProcurador = nomeProcurador;
		this.status = status;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.grupo = grupo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProcurador() {
		return nomeProcurador;
	}

	public void setNomeProcurador(String nomeProcurador) {
		this.nomeProcurador = nomeProcurador;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<PautaDeAudiencia> getPautas() {
		return pautas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Procurador other = (Procurador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
