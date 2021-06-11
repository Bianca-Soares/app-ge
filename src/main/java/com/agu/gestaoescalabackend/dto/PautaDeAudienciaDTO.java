package com.agu.gestaoescalabackend.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.agu.gestaoescalabackend.entities.PautaDeAudiencia;

public class PautaDeAudienciaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		private Long id;
		private LocalDate data;
		private LocalTime hora;
		private String sala;
		private String processo;
		private String nomeParte;
		private String cpf;
		private String nomeAdvogado;
		private String objeto;
		
		private ProcuradorDTO procurador;
		
		
		public PautaDeAudienciaDTO() {
		}


		public PautaDeAudienciaDTO(Long id, LocalDate data, LocalTime hora, String sala, String processo,
				String nomeParte, String cpf, String nomeAdvogado, String objeto, ProcuradorDTO procurador) {
			id = id;
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
		
		public PautaDeAudienciaDTO(PautaDeAudiencia entity) {
			id = entity.getId();
			data = entity.getData();
			hora = entity.getHora();
			sala = entity.getSala();
			processo = entity.getProcesso();
			nomeParte = entity.getNomeParte();
			cpf = entity.getCpf();
			nomeAdvogado = entity.getNomeAdvogado();
			objeto = entity.getObjeto();
			procurador = new ProcuradorDTO(entity.getProcurador());
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


		public ProcuradorDTO getProcurador() {
			return procurador;
		}


		public void setProcurador(ProcuradorDTO procurador) {
			this.procurador = procurador;
		}
		
	
}
