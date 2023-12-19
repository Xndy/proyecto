/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.Date;
import java.util.List;
import org.proyecto.dto.ProyectoDto;
import org.proyecto.dto.ProyectoHitoDto;
import org.proyecto.entity.Proyecto;
import org.proyecto.entity.ProyectoHito;
import org.proyecto.mappers.ProyectoHitoMapper;
import org.proyecto.mappers.ProyectoMapper;
import org.proyecto.repository.ProyectoHitoRepository;
import org.proyecto.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ORIGAMI
 */
@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository repository;
    @Autowired
    private ProyectoMapper mapper;
    @Autowired
    private ProyectoHitoMapper hitoMapper;
    @Autowired
    private ProyectoHitoRepository hitoRepository;

    public List<ProyectoDto> consultarProyectos() {
        List<Proyecto> proyectos = repository.findAll();
        return mapper.toDto(proyectos);
    }

    public ProyectoDto guardarProyecto(ProyectoDto dto) {
        Proyecto proyecto = mapper.toEntity(dto);
        if (proyecto.getFechaCreacion() == null) {
            proyecto.setFechaCreacion(new Date());
        }
        proyecto.setEstado("A".charAt(0));
        if (proyecto.getUsuarioCreacion() == null) {
            proyecto.setUsuarioCreacion("admin");
        }
        proyecto = repository.save(proyecto);
        if (dto.getHitos() != null && !dto.getHitos().isEmpty()) {
            List<ProyectoHito> hitos = hitoMapper.toEntity(dto.getHitos());
            for (ProyectoHito ph : hitos) {
                ph.setProyecto(proyecto);
            }
            hitoRepository.saveAll(hitos);
        }
        return mapper.toDto(proyecto);
    }

}
