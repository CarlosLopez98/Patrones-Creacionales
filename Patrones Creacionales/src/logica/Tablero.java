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
                
                if(x==0 || x==11 || y==0 || y==15){
                    tablero[y][x] = new Torre();
                }else{ 
                    tablero[y][x] = null;
                }
            }
        }
    }
    
    public void setObject(Objeto o, int posX, int posY){
        tablero[posY][posX] = o;
    }
    
    public Objeto[][] getTablero(){
        return tablero;
    } 
}
