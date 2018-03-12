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
    
    public int posX,posY;
    
    public Controlador(){
        
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("(" + me.getX() + "," + me.getY() + ")");
        
        posX = me.getX();
        posY = me.getY();
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
