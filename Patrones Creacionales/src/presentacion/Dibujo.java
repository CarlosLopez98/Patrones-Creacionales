/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import javax.swing.ImageIcon;
import logica.Agente;
import logica.Duende;
import logica.Tablero;

/**
 *
 * @author Carlos
 */
public class Dibujo extends Canvas {
    
    private BufferStrategy buffer;
    private Graphics g;
    
    public Tablero miTablero;
    public Controlador miControl;
    public Agente miAgente;
    public Duende miDuende;
    private ImageIcon grass;
    private ImageIcon muro1,muro2;
    private ImageIcon valla;
    
    public Dibujo(int ancho, int alto){
        this.setSize(ancho, alto);
        setFocusable(true);
        
        g = (Graphics2D)g;
        miTablero = new Tablero();
        miControl = new Controlador(this);
        
        miAgente = new Agente();
        miDuende = new Duende();
        
        grass = new ImageIcon(getClass().getResource("/img/Grass.png"));
        muro1 = new ImageIcon(getClass().getResource("/img/muro1.png"));
        muro2 = new ImageIcon(getClass().getResource("/img/muro2.png"));
        valla = new ImageIcon(getClass().getResource("/img/valla.png"));
        
        capturarEventos();
    }
    
    public void dibujar() {
        this.buffer = getBufferStrategy();
        
        if(this.buffer == null){
            createBufferStrategy(2);
            return;
        }
        
        this.g = buffer.getDrawGraphics();
        
        
        // DIbujar aqui
        g.setColor(Color.black);
        
        for(int y=0; y<16; y++){
            for(int x=0; x<12; x++){
                // Matriz guia
                g.drawRect(x*32, y*32, 32, 32);
                g.setFont(new Font("Arial",Font.PLAIN,10));
                g.drawString(x+","+y,x*32,(y+1)*32);
                
                /* PRUEBA DE MATRIZ */
                switch(miTablero.getTablero()[y][x]){
                    case 0:
                        g.drawImage(grass.getImage(),x*32, y*32, 32, 32, null);
                        break;
                    case 1:
                        g.drawImage(muro1.getImage(), x*32, y*32, 32, 32, null);
                        break;
                    case 2:
                        g.drawImage(muro2.getImage(), x*32, y*32, 32, 32, null);
                        break;
                    case 3:
                        g.drawImage(valla.getImage(), x*32, y*32, 32, 32, null);
                        break;
                }
                

                /* CAPTURA DE LA POSICION DEL MOUSE EN LA CLASE CONTROLADOR */
                if(miControl.boton == 1){
                    miTablero.setObject(3, miControl.posX, miControl.posY);
                    System.err.println("(" + miControl.posX + "," + miControl.posY + ")");
                    miControl.boton = 0;
                }
            }
        }

        this.g.dispose();
        this.buffer.show();
    }
    
    public void capturarEventos(){
        this.addMouseListener(miControl);
    }
}
