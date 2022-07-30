package com.portfolioweb.sgr.Interface;

import com.portfolioweb.sgr.Entity.Persona;
import java.util.List;

// interface extiende de entidad declara interfaces
public interface IPersonaService {
    // Traer lista de Persona
    public List<Persona> getPersona();
    
    // Guardar objeto Persona
    public void savePersona(Persona persona);
    
    // Eliminar objeto por ID
    public void deletePersona(Long id);
    
    // Buscar objeto por ID
    public Persona findPersona(Long id);
}
