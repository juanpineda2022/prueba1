/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jpine
 */

@Entity
@Table(name="moto")
public class Motocicleta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMotocicleta;
    @Column(name = "nombreCompleto", length = 50, nullable = false, unique = true, updatable = true)
    private String name;
    @Column(name = "modeloMotocicleta")
    private String model;

    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnoreProperties("listaMotocicletas") //Para consulta
    private Usuario usuario;
    
    public Motocicleta() {
    }

    public Motocicleta(Integer idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public Motocicleta(Integer idMotocicleta, String name, String model) {
        this.idMotocicleta = idMotocicleta;
        this.name = name;
        this.model = model;
    }

    
    public Integer getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(Integer idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}
