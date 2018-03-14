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
public class Duende extends Personaje{
    
    public Duende(){
        vida = 100;
        ataque = 8;
        velocidad = 6;
        arma = "Lanza";
        escudo = "No tiene";
        sprites = new ImageIcon[11];
        
        ImageIcon imagen;
        for(int i=0; i<11; i++){
            String nombre = "Goblin" + Integer.toString(i+1);
            String ubicacion = "/img/Goblin/Front/"+nombre+".png";
            imagen = new ImageIcon(getClass().getResource(ubicacion));
            sprites[i] = imagen;
        }
    }
    
    @Override
    public void moverse() {
        // su velocidad es media
    }

    @Override
    public void atacar() {
        // son ataques no tan fuertes mas si se esta desplazando
    }

    @Override
    public void defender() {
        // es el mas resistente de todos
    }
    
    
    
}
