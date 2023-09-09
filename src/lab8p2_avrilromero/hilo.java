/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_avrilromero;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author Valeria Romero
 */
public class hilo extends Thread {

    private ArrayList<Jugador> x;
    private ArrayList<JProgressBar> p;
 
    private boolean parar;

    public hilo(ArrayList<Jugador> x, JProgressBar barra, JProgressBar barra2, JProgressBar barra3) {
        this.x = x;
        this.barra = barra;
        this.barra2 = barra2;
        this.barra3 = barra3;
    }

    public ArrayList<Jugador> getX() {
        return x;
    }

    public void setX(ArrayList<Jugador> x) {
        this.x = x;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public JProgressBar getBarra3() {
        return barra3;
    }

    public void setBarra3(JProgressBar barra3) {
        this.barra3 = barra3;
    }

    @Override
    public void run() {
        while (parar) {

            Random r = new Random();

            for (int i = 0; i < x.size(); i++) {
                int r1 = r.nextInt(1, 20);
                p.get(i).setValue(p.get(i).getValue() + r1);
                if (barra.getValue() == 100 || barra2.getValue() == 100 || barra3.getValue() == 100) {
                    parar = true;
                    break;

                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
