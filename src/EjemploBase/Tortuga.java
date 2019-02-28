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

    
    public void pintarRectangulo(double x, double y) {
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
       this.tortuga.setPos(-75, 40);
       this.tortuga.right(180);//mirando arriba Nota: el angulo es un double
       pintarRectangulo(30, 20);//pinta cabeza, queda mirando izquierda
       this.tortuga.left(90);//mirando hacia abajo
       this.tortuga.setPos(-75, 50);
       this.tortuga.right(60);
       pintarRectangulo(Math.sqrt(1200), 40); //Aqui pinta la oreja de la izquierda de la hoja
       this.tortuga.setPos(-45, 50);
       this.tortuga.left(120);
       pintarRectangulo(40, Math.sqrt(1200));
       
       //A partir de aqui pinta los ojos
       this.tortuga.setPos(-65, 48);
       pintarRectangulo(2, 2);
       this.tortuga.setPos(-55, 48);
       this.tortuga.right(90);
       pintarRectangulo(2, 2);
       this.tortuga.setPos(-75, 80);
       
    }
}
