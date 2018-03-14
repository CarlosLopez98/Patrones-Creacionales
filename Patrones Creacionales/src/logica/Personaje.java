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
    
    public ImageIcon[] sprites;
    protected int vida;
    protected int ataque;
    protected int velocidad;
    protected String arma;
    protected String escudo;
    
    
    public abstract void moverse();
    public abstract void atacar();
    public abstract void defender();
    
    @Override
    public Personaje clone() {
        Personaje clonedPersonaje = null;
        try {
            clonedPersonaje = (Personaje) super.clone();
            clonedPersonaje.setSprites(sprites);
            clonedPersonaje.setVida(vida);
            clonedPersonaje.setAtaque(ataque);
            clonedPersonaje.setVelocidad(velocidad);
            clonedPersonaje.setArma(arma);
            clonedPersonaje.setEscudo(escudo);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedPersonaje;
    } // method clone

    public ImageIcon[] getSprites() {
        return sprites;
    }

    public void setSprites(ImageIcon[] sprites) {
        this.sprites = sprites;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
    
}
