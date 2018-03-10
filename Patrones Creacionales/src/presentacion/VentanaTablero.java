/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Carlos
 */
public class VentanaTablero extends JFrame{
    
    private final int ALTO;
    private final int ANCHO;
    
    // Componentes de la ventana
    private JPanel panelPrincipal;
    private Canvas canvas;
    
    public VentanaTablero(){
        ANCHO = 384;
        ALTO = 512;
        
        this.setSize(ANCHO, ALTO);
        
        this.setTitle("Battle ...");
        this.setResizable(false);
        
        this.initComponents();
        
        this.setVisible(true);
    }
    
    private void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(panelPrincipal);
        this.panelPrincipal.setLayout(null);
        
        this.canvas = new Canvas();
        this.canvas.setBackground(Color.blue);
	this.canvas.setBounds(32, 0, 320, 512);
	this.panelPrincipal.add(canvas);
    }
}
