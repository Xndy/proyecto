/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.resource;

import org.proyecto.dto.ProyectoDto;
import org.proyecto.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ORIGAMI
 */
@RestController
public class ProyectoResource {

    @Autowired
    private ProyectoService proyectoService;

    @RequestMapping(value = "consultarProyectos", method = RequestMethod.GET)
    public ResponseEntity<?> consultarProyectos() {
        return new ResponseEntity<>(proyectoService.consultarProyectos(), HttpStatus.OK);
    }

    @RequestMapping(value = "guardarProyecto", method = RequestMethod.POST)
    public ResponseEntity<?> guardarProyecto(@RequestBody ProyectoDto dto) {
        return new ResponseEntity<>(proyectoService.guardarProyecto(dto), HttpStatus.OK);
    }

}
