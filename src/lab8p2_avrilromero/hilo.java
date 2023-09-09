/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_avrilromero;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Valeria Romero
 */
public class hilo extends Thread {

    private ArrayList<Jugador> x;
    private ArrayList<JProgressBar> p;

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
                    break;

                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
