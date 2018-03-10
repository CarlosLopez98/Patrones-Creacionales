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
public abstract class Personaje implements Cloneable{
    
    //Sprite
    private int vida;
    private String arma;
    private String escudo;
    
    public abstract void moverse();
    public abstract void atacar();
    public abstract void defender(); 
    
}
