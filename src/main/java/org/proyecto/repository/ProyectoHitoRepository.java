/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.repository;

import org.proyecto.dto.ProyectoDto;
import org.proyecto.entity.ProyectoHito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ORIGAMI
 */
@Repository
public interface ProyectoHitoRepository extends JpaRepository<ProyectoHito, Integer> {

}
