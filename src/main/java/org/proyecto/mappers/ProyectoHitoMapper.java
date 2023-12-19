/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.proyecto.dto.ProyectoHitoDto;
import org.proyecto.entity.ProyectoHito;

/**
 *
 * @author ORIGAMI
 */
@Mapper(componentModel = "spring")
public interface ProyectoHitoMapper {

    @Mapping(target = "proyectoId", source = "proyectoHito.proyecto.id")
    ProyectoHitoDto toDto(ProyectoHito proyectoHito);

    @Mapping(target = "proyecto.id", source = "dto.proyectoId")
    ProyectoHito toEntity(ProyectoHitoDto dto);

    List<ProyectoHitoDto> toDto(List<ProyectoHito> proyectosHitos);

    List<ProyectoHito> toEntity(List<ProyectoHitoDto> proyectosHitos);
}
