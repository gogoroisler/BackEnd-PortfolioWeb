package com.portfolioweb.sgr.Service;

import com.portfolioweb.sgr.Entity.Persona;
import com.portfolioweb.sgr.Interface.IPersonaService;
import com.portfolioweb.sgr.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// etiqueta declara servicio
@Service

public class ImpPersonaService implements IPersonaService{
    // autowired servicio llama al repositorio
    @Autowired 
            IPersonaRepository ipersonaRepository;

    // override trae los metodos de la clase
    // listar personas
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    // guardar persona
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    //borrar persona
    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }
    
    // buscar persona
    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
   }
