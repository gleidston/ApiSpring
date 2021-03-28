package com.zup.gleidston.vacinador.repository;

import com.zup.gleidston.vacinador.model.grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<grupo , Integer> {

}
