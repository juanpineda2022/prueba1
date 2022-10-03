/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.g4.g34.proyecto.AlquilerMotocicletas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jpine
 */
@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    @Column(name = "nombreUsuario", length = 30, nullable = false, unique = true)
    private String nameUser;
    @Column(name = "emailUsuario", length = 30, nullable = false, unique = true)
    private String emailUser;
    
    @OneToMany(mappedBy = "usuario", cascade = (CascadeType.PERSIST))
    @JsonIgnoreProperties("usuario") //Para consulta
    private List<Motocicleta> listaMotocicletas;
    
    
    public Usuario() {
    }

    public Usuario(Integer idRol) {
        this.idRol = idRol;
    }

    public Usuario(Integer idRol, String nameUser, String emailUser) {
        this.idRol = idRol;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }
    
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public List<Motocicleta> getListaMotocicletas() {
        return listaMotocicletas;
    }

    public void setListaMotocicletas(List<Motocicleta> listaMotocicletas) {
        this.listaMotocicletas = listaMotocicletas;
    }
}
