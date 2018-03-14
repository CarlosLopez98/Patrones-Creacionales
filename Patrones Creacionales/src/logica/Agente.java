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
public class Agente extends Personaje{
    
    public Agente(){
        vida = 100;
        ataque = 10;
        velocidad = 4;
        arma = "Pistola";
        escudo = "No tiene";
        sprites = new ImageIcon[9];
        
        ImageIcon imagen;
        for(int i=0; i<9; i++){
            String nombre = "FBI" + Integer.toString(i+1);
            String ubicacion = "/img/FBI/Front/"+nombre+".png";
            imagen = new ImageIcon(getClass().getResource(ubicacion));
            sprites[i] = imagen;
        }
    }
    
    @Override
    public void moverse() {
        // es el que se desplaza mas rapido
    }

    @Override
    public void atacar() {
        // sus ataques son letales
    }

    @Override
    public void defender() {
        // se defiende de solo no esta en movimiento
    }
}
