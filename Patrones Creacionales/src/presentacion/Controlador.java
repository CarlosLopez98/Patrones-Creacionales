/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Carlos
 */
public class Controlador implements MouseListener{
    
    public int posX,posY,boton;
    public Dibujo miDibujo;
    
    public Controlador(Dibujo d){
        miDibujo = d; 
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        if(me.getButton() == MouseEvent.BUTTON1){
            boton = 1;
        }else if(me.getButton() == MouseEvent.BUTTON3){
            boton = 3;
        }else{
            boton = 0;
        }
        
        posX = me.getX();
        posY = me.getY();
        for(int y=0; y<16; y++){
            for(int x=0; x<12; x++){
                if((posX > x*32 && posX < (x+1)*32) && (posY > y*32 && posY < (y+1)*32)){
                    posX = x;
                    posY = y;
                }
            }
        }
        if(boton == 1){
//            miDibujo.miTablero.setObject(new Valla(), posX, posY);
//            System.out.println("(" + posX + "," + posY + ")");
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}
