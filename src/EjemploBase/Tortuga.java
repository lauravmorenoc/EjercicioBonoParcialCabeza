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
 * @author Estudiante
 */
public class Tortuga extends Thread{
     private Turtle tortuga;

    public Tortuga(Turtle tortuga) {
        this.tortuga = tortuga;
        tortuga.setPos(-60, 20);
        tortuga.setColor(Color.yellow);

    }

    
    public void pintarRectangulo(int x, int y) {
      this.tortuga.forward(y);
      this.tortuga.right(90);
      this.tortuga.forward(x);
      this.tortuga.right(90);
      this.tortuga.forward(y);
      this.tortuga.right(90);
      this.tortuga.forward(x);
}
    @Override
    public void run(){
       pintarRectangulo(20, 20);
       pintarRectangulo(20, 20); //cachetes
       this.tortuga.setPos(0, 0);
       this.tortuga.right(180);//mirando arriba
       pintarRectangulo(0, 0);//Cabeza mirando izquierda
       this.tortuga.left(90);//mirando hacia abajo
       this.tortuga.right(45);
       pintarRectangulo(0, 0);
       this.tortuga.setPos(0, 0);
       this.tortuga.left(90);
       pintarRectangulo(0, 0);//falta pintar ojitos
       
       
    }
}
