/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2=null;
    
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga2=new Turtle(this);
    }
    
    public void iniciar(){
       tortuga1.setPos(-60, 20);
       tortuga1.setColor(Color.yellow);
       PintarRectangulo rect1 = new PintarRectangulo(tortuga1, 20, 20);
       tortuga1.setPos(-60, 20);
       
       
       rect1.start();
       
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
