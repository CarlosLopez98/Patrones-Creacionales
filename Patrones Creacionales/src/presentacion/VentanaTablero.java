/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.BorderLayout;
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
    
    private Dibujo miDibujo;
    
    public VentanaTablero(String nombre, Dibujo d){
        miDibujo = d;
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(nombre);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(miDibujo);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
