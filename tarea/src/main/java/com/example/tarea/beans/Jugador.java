package com.example.tarea.beans;

import com.example.tarea.beans.Seleccion;

public class Jugador {
    private int idJugador;
    private String nombre;
    private int edad;
    private String posicion;
    private String club;
    private Seleccion snIdSeleccion;


    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Seleccion getSnIdSeleccion() {
        return snIdSeleccion;
    }

    public void setSnIdSeleccion(Seleccion snIdSeleccion) {
        this.snIdSeleccion = snIdSeleccion;
    }
}
