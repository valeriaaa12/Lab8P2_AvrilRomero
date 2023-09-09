/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_avrilromero;

import java.io.Serializable;

/**
 *
 * @author Valeria Romero
 */
class Jugador implements Serializable {
    private String nombre;
    private Pais pais;
    private int edad;
    private double estatura;
    private String estilo;
    private int distancia;
    private double tiempo;
    private int medallas;
  private final long serialVersionUID = 333L;
    public Jugador() {
    }

    public Jugador(String nombre, Pais pais, int edad, double estatura, String estilo, int distancia, double tiempo, int medallas) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
