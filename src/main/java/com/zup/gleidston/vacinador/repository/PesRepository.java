package com.zup.gleidston.vacinador.repository;

import com.zup.gleidston.vacinador.model.AbstractEntity;
import com.zup.gleidston.vacinador.model.pes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PesRepository   extends JpaRepository<pes ,Integer > {
    Optional<pes> findByEmail(String email);
}
