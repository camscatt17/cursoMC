package com.camilasantos.cursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.camilasantos.cursoMC.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Integer>{
	
}
