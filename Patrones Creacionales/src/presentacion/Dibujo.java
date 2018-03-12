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
import javax.swing.ImageIcon;
import logica.Tablero;
import logica.Torre;

/**
 *
 * @author Carlos
 */
public class Dibujo extends Canvas {
    
    private Tablero miTablero;
    private ImageIcon grass;
    
    public Dibujo(){
        miTablero = new Tablero();
        
        grass = new ImageIcon(getClass().getResource("/img/grass.png"));
    }

    @Override
    public void paint(Graphics g) {
        g = (Graphics2D) g;
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
    }

}
