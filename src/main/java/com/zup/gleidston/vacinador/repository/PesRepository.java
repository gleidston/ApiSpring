package com.zup.gleidston.vacinador.repository;

import com.zup.gleidston.vacinador.model.AbstractEntity;
import com.zup.gleidston.vacinador.model.pes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesRepository   extends JpaRepository<pes ,Integer > {

}
