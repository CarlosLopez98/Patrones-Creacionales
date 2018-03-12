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

/**
 *
 * @author Carlos
 */
public class Dibujo extends Canvas {
    
    private ImageIcon grass;
    
    public Dibujo(){
        grass = new ImageIcon(getClass().getResource("/img/grass.png"));
    }

    @Override
    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.setColor(Color.black);
        
        for(int x=0; x<12; x++){
            for(int y=0; y<16; y++){
                g.drawRect(x*32, y*32, 32, 32);
                g.setFont(new Font("Arial",Font.PLAIN,10));
                g.drawString(x+","+y,x*32,(y+1)*32);
                g.drawImage(grass.getImage(), x*32, y*32, 32, 32, null);
            }
        }
    }
    
    
}
