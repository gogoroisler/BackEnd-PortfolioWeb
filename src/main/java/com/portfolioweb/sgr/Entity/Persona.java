package com.portfolioweb.sgr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

// declaracion de entidad y getter y setter por lombok, sino tippearlos
@Getter 
@Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "atencion limite de caracteres")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "atencion limite de caracteres")
    private String apellido;
    
    @Size(min = 1, max = 455, message = "atencion limite de caracteres")
    private String img;
    
    @Size(min = 1, max = 455, message = "atencion limite de caracteres")
    private String descripcion;
    
    @Size(min = 1, max = 255, message = "atencion limite de caracteres")
    private String puesto;
}
