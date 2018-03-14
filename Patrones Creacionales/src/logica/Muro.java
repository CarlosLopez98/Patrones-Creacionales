/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Carlos
 */
public class Muro extends Objeto{
    
    public Muro(int ubicacion){
        
        
        if(ubicacion == 1){
            imagen = new ImageIcon(getClass().getResource("/img/muro1.png"));
        }else if(ubicacion == 2){
            imagen = new ImageIcon(getClass().getResource("/img/muro2.png"));
        }
        
    }
}
