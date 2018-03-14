/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import presentacion.Dibujo;
import presentacion.VentanaTablero;

/**
 *
 * @author Carlos
 */
public class Launcher {
    
    private static Dibujo miDibujo;
    private static VentanaTablero ventana;
    private static int PIXALTO;
    private static int PIXANCHO;
    private static int ALTO;
    private static int ANCHO;
    private static int APS = 0;
    private static int FPS = 0;
    
    public static void main(String[] args){
        iniciarJuego();
    }
    
    public static void iniciarJuego(){
        ANCHO = 384;
        ALTO = 512;
        
        crearVentana(ANCHO, ALTO, "FBI vs Duendes");
        iterarBuclePrincipal();
    }
    
    public static void actualizar(){
        APS++;
        miDibujo.dibujar();
    }
    
    public static void dibujar(){
        FPS++;
    }
    
    public static void crearVentana(int ancho, int alto, String nombre){
        miDibujo = new Dibujo(ancho, alto);
        ventana = new VentanaTablero(nombre, miDibujo);
    }
    
    public static void iterarBuclePrincipal(){
        final int NS_POR_SEGUNDO = 1000000000;
        final int APS_OBJETIVO = 60;
        final int NS_POR_ACTUALIZACION = NS_POR_SEGUNDO/APS_OBJETIVO;
        
        long tiempoDeReferenciaActualizacion = System.nanoTime();
        long tiempoDeReferenciaContador = System.nanoTime();
        
        double delta = 0;
        double tiempoSinProcesar;
        
        while(true){
            long tiempoInicial = System.nanoTime();
            tiempoSinProcesar = tiempoInicial - tiempoDeReferenciaActualizacion;
            tiempoDeReferenciaActualizacion = tiempoInicial;
            delta += tiempoSinProcesar/NS_POR_ACTUALIZACION;
            
            while(delta >= 1){
                // actualizar
                delta--;
                actualizar();
            }
            
            dibujar();
            
            if(System.nanoTime() - tiempoDeReferenciaContador >= NS_POR_ACTUALIZACION){
                tiempoDeReferenciaContador = System.nanoTime();
                APS = 0;
                FPS = 0;
            }
        }
    } 
}
