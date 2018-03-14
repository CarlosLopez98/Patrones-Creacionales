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
public abstract class Personaje implements Cloneable{
    
    protected ImageIcon[] sprites;
    protected int vida;
    protected int ataque;
    protected int velocidad;
    protected String arma;
    protected String escudo;
    
    
    public abstract void moverse();
    public abstract void atacar();
    public abstract void defender();
}
