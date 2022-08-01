/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.sgr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreS;
    private String porcentajeS;
    
    public Skill() {
        
    }

    public Skill(String nombreS, String porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
    
    
}
