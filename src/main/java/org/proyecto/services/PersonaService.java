/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.ArrayList;
import java.util.List;
import org.proyecto.dto.PersonaDto;
import org.proyecto.entity.Persona;
import org.proyecto.mappers.PersonaMapper;
import org.proyecto.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ORIGAMI
 */
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;
    @Autowired
    private PersonaMapper mapper;

    public List<PersonaDto> consultarPersonas() {
        List<Persona> personas = repository.findAll();
        List<PersonaDto> personasDtos = mapper.toDto(personas);
//        for (Persona persona : personas) {
//            PersonaDto dto = new PersonaDto();
//            dto.setId(persona.getId());
//            dto.setNombre(persona.getNombre());
//            dto.setApellido(persona.getApellido());
//            personasDtos.add(dto);
//        }
        return personasDtos;
    }
}
