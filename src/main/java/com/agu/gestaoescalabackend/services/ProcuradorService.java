package com.agu.gestaoescalabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agu.gestaoescalabackend.dto.ProcuradorDTO;
import com.agu.gestaoescalabackend.entities.Procurador;
import com.agu.gestaoescalabackend.repositories.ProcuradorRepository;

@Service
public class ProcuradorService {
	
	@Autowired
	private ProcuradorRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProcuradorDTO> findAll(){
		List<Procurador> list = repository.findAllByOrderByNomeProcuradorAsc();
		return list.stream().map(x -> new ProcuradorDTO(x)).collect(Collectors.toList());
	}
}
