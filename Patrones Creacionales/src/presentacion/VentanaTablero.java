/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Carlos
 */
public class VentanaTablero extends JFrame{
    
    private final int PIXALTO;
    private final int PIXANCHO;
    private final int ALTO;
    private final int ANCHO;
    
    private Controlador controlador;
    private MouseEvent me;
    
    // Componentes de la ventana
    private JPanel panelPrincipal;
    private Canvas canvas;
    
    public VentanaTablero(){
        PIXALTO = 29;
        PIXANCHO = 6;
        ANCHO = 384 + PIXANCHO;
        ALTO = 512 + PIXALTO;
        
        this.setSize(ANCHO, ALTO);
        
        this.setTitle("Battle ...");
        this.setResizable(false);
        
        this.initComponents();
    }
    
    private void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	this.add(new Dibujo());
    }
}
