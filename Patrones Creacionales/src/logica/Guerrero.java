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
public class Guerrero extends Personaje{

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
