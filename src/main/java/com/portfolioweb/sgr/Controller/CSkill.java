/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.sgr.Controller;

import com.portfolioweb.sgr.Dto.dtoSkill;
import com.portfolioweb.sgr.Entity.Skill;
import com.portfolioweb.sgr.Security.Controller.Mensaje;
import com.portfolioweb.sgr.Service.SSkill;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/skill")
@CrossOrigin("origins = https://portfolio-web-argprog.web.app")
public class CSkill {
    
    @Autowired
    SSkill sSkill;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list(){
       List<Skill> list = sSkill.list();
       return new ResponseEntity(list, HttpStatus.OK); 
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sSkill.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sSkill.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkill dtoskill){
        if(StringUtils.isBlank(dtoskill.getNombreS()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sSkill.existsByNombreS(dtoskill.getNombreS()))
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        
        Skill skill = new Skill(dtoskill.getNombreS(), dtoskill.getPorcentajeS());
        sSkill.save(skill);
        
        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }
    
        @PutMapping("/update/(id)")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkill dtoskill){
        //Validacion por ID
        if(!sSkill.existsById(id))
            return new ResponseEntity(new Mensaje("ID inexistente"), HttpStatus.BAD_REQUEST);
        // Comparacion de nombre
        if(sSkill.existsByNombreS(dtoskill.getNombreS()) && sSkill.getByNombreS(dtoskill.getNombreS()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Habilidad existente"), HttpStatus.BAD_REQUEST);
        // Vacio
        if(StringUtils.isBlank(dtoskill.getNombreS()))
            return new ResponseEntity(new Mensaje("Nombre obligatorio"), HttpStatus.BAD_REQUEST);
        
        Skill skill = sSkill.getOne(id).get();
        skill.setNombreS(dtoskill.getNombreS());
        skill.setPorcentajeS((dtoskill.getPorcentajeS()));
        
        sSkill.save(skill);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
    }
    
         @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id") int id){
        if(!sSkill.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.BAD_REQUEST);
        Skill skill = sSkill.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

}