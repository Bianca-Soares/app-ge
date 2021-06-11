package com.agu.gestaoescalabackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agu.gestaoescalabackend.dto.PautaDeAudienciaDTO;
import com.agu.gestaoescalabackend.services.PautaDeAudienciaService;

@RestController
@RequestMapping(value = "/pautas")
public class PautaDeAudienciaController {
	
	@Autowired
	private PautaDeAudienciaService service;
	
	@GetMapping
	public ResponseEntity<Page<PautaDeAudienciaDTO>> findAll(Pageable pageable){
		Page<PautaDeAudienciaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	
}
