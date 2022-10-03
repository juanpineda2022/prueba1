/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.controller;

import com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.model.Motocicleta;
import com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.services.MotocicletaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jpine
 */
@RestController
@RequestMapping("moto")
public class MotocicletaController {
    
    @Autowired
    private MotocicletaService ms;
    
    @GetMapping("all")
    public List<Motocicleta> getAll(){
        return ms.getAll();
    }


}
