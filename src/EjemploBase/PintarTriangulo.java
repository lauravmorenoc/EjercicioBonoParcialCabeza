/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author lamorenoca
 */
public class PintarTriangulo extends Thread{
    private Turtle tortuga;
    private int angulo1;
    private int angulo2;
    private int angulo3;
    private int distancia1;

    public PintarTriangulo(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
      tortuga.setColor(Color.yellow);
      this.tortuga.right(angulo1);
      this.tortuga.forward(50);
      this.tortuga.right(180 - angulo2);
      this.tortuga.forward(50);
      this.tortuga.right(180 - angulo3);
      this.tortuga.forward(50);
}
    
}
