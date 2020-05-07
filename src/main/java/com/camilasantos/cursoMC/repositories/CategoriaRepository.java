package com.camilasantos.cursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.camilasantos.cursoMC.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>{
	
}
