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
    private static int ALTO = 16;
    private static int ANCHO = 12;
    
    private Objeto[][] tablero;
    
    public Tablero(){
        tablero = new Objeto[ALTO][ANCHO];
        for(int y=0; y<16; y++){
            for(int x=0; x<12; x++){
                
                if(y == 0){
                    tablero[y][x] = new Muro(1);
                }else if(y == 15){
                    tablero[y][x] = new Muro(2);
                }else if(x == 0 || x == 11){
                    tablero[y][x] = new Valla();
                }else{ 
                    tablero[y][x] = null;
                }
            }
        }
    }
    
    private boolean verificarTablero(int posX, int posY){
        return tablero[posY][posX] == null;
    }
    
    public void setObject(Objeto o, int posX, int posY){
        if(verificarTablero(posX,posY)){
            tablero[posY][posX] = o;
        }    
    }
    
    public Objeto[][] getTablero(){
        return tablero;
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
