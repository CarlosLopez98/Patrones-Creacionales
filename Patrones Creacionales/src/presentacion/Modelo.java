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
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

/**
 *
 * @author Carlos
 */
public class Modelo implements Runnable{
    
    private VentanaTablero miVentana;
    private Thread hiloDibujo;
    
    public Modelo(){
        hiloDibujo = new Thread(this);
    }
    
    @Override
    public void run() {
        
    }
    
}
