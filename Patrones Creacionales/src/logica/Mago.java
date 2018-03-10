/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Carlos
 */
public class Mago extends Personaje{

    @Override
    public void moverse() {
        // Se desplaza mas lento que los otros dos personajes
    }

    @Override
    public void atacar() {
        // Sus ataques reducen el ataque de los demas personajes por un turno
        // no quitan demasiada vida
    }

    @Override
    public void defender() {
        // no tiene muy buena defensa
    }
    
}
