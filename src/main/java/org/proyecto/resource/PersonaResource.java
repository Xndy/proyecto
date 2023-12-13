/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.resource;

import org.proyecto.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ORIGAMI
 */
@RestController
public class PersonaResource {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "consultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPersonas() {
        return new ResponseEntity<>(personaService.consultarPersonas(), HttpStatus.OK);
    }

}
