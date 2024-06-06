package com.example.tarea.beans;

import com.example.tarea.beans.Estadio;
public class Seleccion {
    private int idSeleccion;
    private String nombre;
    private String tecnico;
    private Estadio estadioIdEstadio;


    public int getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(int idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Estadio getEstadioIdEstadio() {
        return estadioIdEstadio;
    }

    public void setEstadioIdEstadio(Estadio estadioIdEstadio) {
        this.estadioIdEstadio = estadioIdEstadio;
    }
}