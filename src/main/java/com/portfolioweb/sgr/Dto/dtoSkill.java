/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.sgr.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author user
 */
public class dtoSkill {
   @NotBlank
    private String nombreS;
   @NotBlank
   private String porcentajeS;

    public dtoSkill() {
    }

    public dtoSkill(String nombreS, String porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
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
