package com.agu.gestaoescalabackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agu.gestaoescalabackend.dto.PautaDeAudienciaDTO;
import com.agu.gestaoescalabackend.entities.PautaDeAudiencia;
import com.agu.gestaoescalabackend.repositories.PautaDeAudienciaRepository;
import com.agu.gestaoescalabackend.repositories.ProcuradorRepository;


@Service
public class PautaDeAudienciaService {
	@Autowired
	private PautaDeAudienciaRepository repository;
	
	@Autowired
	private ProcuradorRepository procuradorRepository;
	
	@Transactional(readOnly = true)
	public Page<PautaDeAudienciaDTO> findAll(Pageable pageable){
		procuradorRepository.findAll();
		Page<PautaDeAudiencia> result = repository.findAll(pageable);
		return result.map(x -> new PautaDeAudienciaDTO(x));	
	}
}
