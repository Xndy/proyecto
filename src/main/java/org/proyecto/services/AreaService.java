/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.services;

import java.util.ArrayList;
import java.util.List;
import org.proyecto.dto.AreaDto;
import org.proyecto.entity.Area;
import org.proyecto.mappers.AreaMapper;
import org.proyecto.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ORIGAMI
 */
@Service
public class AreaService {

    @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMapper areaMapper;

    public List<AreaDto> consultarAreas() {
        List<Area> areas = repository.findAll();
        //List<AreaDto> areasDtos = areaMapper.toDto(areas);
        return areaMapper.toDto(areas);
    }

}
