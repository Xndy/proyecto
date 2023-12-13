/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.PersonaDto;
import org.proyecto.entity.Persona;

/**
 *
 * @author ORIGAMI
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDto toDto(Persona persona);

    Persona toEntity(PersonaDto dto);

    List<PersonaDto> toDto(List<Persona> personas);

    List<Persona> toEntity(List<PersonaDto> personas);

}
