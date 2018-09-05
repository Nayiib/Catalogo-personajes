/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallaEleccion;

import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PATICO
 */
public class Producto extends JFrame{
    public Producto(){
        this.setBounds(0, 0, 400, 400);
        this.setTitle("Personaje Finalizado");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        Container contentpane = getContentPane();
        contentpane.setLayout(null);
        this.setVisible(true);
        
        JButton boton = new JButton("1");
        boton.setBounds(0, 0, 400, 400);
        ImageIcon imagen = new ImageIcon("Imagenes/final elfo.jpg");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono);
        contentpane.add(boton);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
