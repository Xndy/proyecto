/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.AreaDto;
import org.proyecto.entity.Area;

/**
 *
 * @author ORIGAMI
 */
@Mapper(componentModel = "spring")
public interface AreaMapper {

    AreaDto toDto(Area area);

    Area toEntity(AreaDto dto);

    List<AreaDto> toDto(List<Area> areas);

    List<Area> toEntity(List<AreaDto> areas);

}
