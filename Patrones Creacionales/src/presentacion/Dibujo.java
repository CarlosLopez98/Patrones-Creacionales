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
import logica.Tablero;
import logica.Torre;

/**
 *
 * @author Carlos
 */
public class Dibujo extends Canvas {
    
    private BufferStrategy buffer;
    private Graphics g;
    
    public Tablero miTablero;
    public Controlador miControl;
    private ImageIcon grass;
    
    public Dibujo(int ancho, int alto){
        this.setSize(ancho, alto);
        setFocusable(true);
        
        g = (Graphics2D)g;
        miTablero = new Tablero();
        miControl = new Controlador(this);
        grass = new ImageIcon(getClass().getResource("/img/Grass.png"));
        
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
                
                if(miTablero.getTablero()[y][x] == null){
                    g.drawImage(grass.getImage(), x*32, y*32, 32, 32, null);
                }else{
                    g.drawImage(miTablero.getTablero()[y][x].imagen.getImage(), x*32, y*32, 32, 32, null);
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
