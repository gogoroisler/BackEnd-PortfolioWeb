package com.portfolioweb.sgr.Repository;

import com.portfolioweb.sgr.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// anotacion declara repositorio interface
@Repository

// repositorio extiende de interface
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
