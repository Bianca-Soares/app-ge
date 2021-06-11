package com.agu.gestaoescalabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agu.gestaoescalabackend.entities.Procurador;

public interface ProcuradorRepository extends JpaRepository<Procurador, Long>{
	List<Procurador> findAllByOrderByNomeProcuradorAsc();

}
