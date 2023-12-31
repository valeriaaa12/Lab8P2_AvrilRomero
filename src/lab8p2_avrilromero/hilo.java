/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_avrilromero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Valeria Romero
 */
public class hilo extends Thread implements Serializable {

    private ArrayList<Jugador> x;
    private ArrayList<JProgressBar> p;
    private File archivo = new File("./GanadoresdeTodaLaVida");
    private boolean parar = true;

    public hilo(ArrayList<Jugador> x, ArrayList<JProgressBar> p) {
        this.x = x;
        this.p = p;
    }

    public ArrayList<Jugador> getX() {
        return x;
    }

    public void setX(ArrayList<Jugador> x) {
        this.x = x;
    }

    @Override
    public void run() {
        while (parar) {
            Random r = new Random();
            for (int i = 0; i < x.size(); i++) {
                int r1 = r.nextInt(1, 10);
                p.get(i).setValue(p.get(i).getValue() + r1);
                if (p.get(i).getValue() == 100) {

                    parar = false;
                    String nombre = x.get(i).getNombre();
                    JOptionPane.showMessageDialog(null, "El ganador es: " + nombre);
                    adminGanadores ag = new adminGanadores("./Ganadores.lab");
                    ag.setGanador(x.get(i));
                    ag.escribirArchivo();
                    ag.cargarArchivo();
              
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
