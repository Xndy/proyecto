/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.ArrayList;
import java.util.List;
import org.proyecto.dto.ProcesoDto;
import org.proyecto.entity.Proceso;
import org.proyecto.mappers.ProcesoMapper;
import org.proyecto.repository.ProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ORIGAMI
 */
@Service
public class ProcesoService {

    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMapper mapper;

    public List<ProcesoDto> consultarProcesos() {
        List<Proceso> procesos = repository.findAll();
        List<ProcesoDto> procesosDtos = mapper.toDto(procesos);
//        for (Proceso proceso : procesos) {
//            ProcesoDto dto = new ProcesoDto();
//            dto.setId(proceso.getId());
//            dto.setDescripcion(proceso.getDescripcion());
//            procesosDtos.add(dto);
//        }
        return procesosDtos;
    }

}
