package com.agu.gestaoescalabackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agu.gestaoescalabackend.dto.ProcuradorDTO;
import com.agu.gestaoescalabackend.services.ProcuradorService;

@RestController
@RequestMapping(value = "/procuradores")
public class ProcuradorController {
	@Autowired
	private ProcuradorService service;
	
	@GetMapping
	public ResponseEntity<List<ProcuradorDTO>> findAll(){
		List<ProcuradorDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
