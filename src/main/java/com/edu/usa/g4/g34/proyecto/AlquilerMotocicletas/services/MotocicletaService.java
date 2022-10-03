/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.services;

import com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.model.Motocicleta;
import com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.repository.MotocicletaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jpine
 */
@Service
public class MotocicletaService {
    
    @Autowired
    private MotocicletaRepository mr;
    
    public List<Motocicleta> getAll(){
        return (List<Motocicleta>)mr.findAll();
    }
}
