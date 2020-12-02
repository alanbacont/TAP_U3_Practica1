
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alancontr
 */
public class Frases extends Canvas{
    Frase f = new Frase();
    
    Timer t1,t2;
    int i;
    String[] frases = {"Elaborado por Barocio Contreras","Programación es lo mejor","Ing. Sistemas la mejor carrera","ITT es el mejor","#noMeRepruebesBenigno",
                       "Java en NetBeans","NetBeans el mejor IDE","Eclipse es otro IDE","MacOS Big Sur con problemas en Java","MySQL para base de datos",
                       "Multi-Hilo tercera unidad","Dibujamos en canvas","Thread es hilo en inglés","Windows 10 SO popular","Programar es como ejercicio","Google gigante web",
                       "FaceBook red social","Amazon para compras","Procesadores ARM de Apple","Chip Apple M1",
                       "Programado en MacBook Pro 13inch 2019","Linux","Ing. En Sistemas Computacionales","Hilos son efectivos","JFrame es una ventana","AndroidStudio",
                       "Base de Datos en SQL","18401084","TAP es Tópicos avanzados de programación",
                       "GitHub para los proyectos","Inteligencia Artificial","NVidia para video","AMD lider en procesadores","Programar es un músculo","Transistor",
                       "Packet Tracer para redes","Programación Web","iOS es un SO cerrado","Xbox Series X consola más potente"};
    
    public Frases(){
        
        t1 = new Timer(200, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                f.rebotar();
                repaint();
                
            
                t2.start();
             }   
        });
        
        t2 = new Timer(20000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = (int)(Math.random()*39);
                f.rebotar();
                repaint();
            }
        });
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2 = (Graphics2D)g;
        
        f.pintar(g2,frases[i]);
    }
    
}
