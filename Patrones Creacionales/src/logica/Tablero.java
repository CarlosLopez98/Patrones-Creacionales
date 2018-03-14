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
public class Tablero {
    private static final int ALTO = 16;
    private static final int ANCHO = 12;
    
    private final int[][] tablero;
    private final Personaje[][] personajes;
    
    public Tablero(){
        tablero = new int[ALTO][ANCHO];
        personajes = new Personaje[ALTO][ANCHO];
        /*
            elementos de la matriz
            
            0 = pasto(nulo)
            1 = muro1
            2 = muro2
            3 = valla
        */
        for(int y=0; y<16; y++){
            for(int x=0; x<12; x++){
                if(y == 0){
                    tablero[y][x] = 1;
                }else if(y == 15){
                    tablero[y][x] = 2;
                }else if(x == 0 || x == 11){
                    tablero[y][x] = 3;
                }else{ 
                    tablero[y][x] = 0;
                }
                
                personajes[y][x] = null;
            }
        }
    }
    
    private boolean verificarTablero(int posX, int posY){
        return tablero[posY][posX] == 0;
    }
    
    public void setObject(int o, int posX, int posY){
        if(verificarTablero(posX,posY)){
            tablero[posY][posX] = o;
        }    
    }
    
    public void setPersonaje(Personaje p, int posX, int posY){
        if(tablero[posY][posX] == 0){
            tablero[posY][posX] = 4;
            personajes[posY][posX] = p;
        }
        if(tablero[posY][posX] == 4){
            tablero[posY][posX] = 0;
            personajes[posY][posX] = p;
        }
    }
    
    /* PRUEBA -- retorno de la matriz como Objeto */
    public int[][] getTablero(){
        return tablero;
    }
    
    public Personaje[][] getPersonajes(){
        return personajes;
    }
    
    public void imprimir(){
        for(int y=0; y<16; y++){
            for(int x=0; x<12; x++){
                System.out.print(tablero[y][x]+" ");
            }
            System.out.println();
        }
    }
}
