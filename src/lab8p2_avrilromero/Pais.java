/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_avrilromero;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Pais implements Serializable{
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList();
    private int medallas;
    private final long serialVersionUID = 333L;

    public Pais() {
    }

    public Pais(String nombre,  int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void setNadador(Jugador a){
        jugadores.add(a);
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
