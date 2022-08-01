/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.sgr.Repository;

import com.portfolioweb.sgr.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository

public interface RSkill extends JpaRepository<Skill, Integer>{
    
    public Optional<Skill> findByNombreS(String nombreS);
    public boolean existsByNombreS(String nombreS);
}
    

