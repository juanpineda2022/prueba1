/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.repository;

import com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.model.Motocicleta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jpine
 */
@Repository
public interface MotocicletaRepository extends CrudRepository<Motocicleta, Integer>{
    
}
