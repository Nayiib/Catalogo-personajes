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
import javax.swing.JLabel;


public class Producto extends JFrame{

    public Producto(){
        this.setBounds(0, 0, 650, 400);
        this.setTitle("Personaje Finalizado");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        Container contentpane = getContentPane();
        contentpane.setLayout(null);
        this.setVisible(true);
        JLabel equipo1,equipo2,equipo3,raza,hp,mana;
        
        
        raza= new JLabel();
        raza.setBounds(30, 10, 100, 30);
        raza.setText("Humano/mago");
        contentpane.add(raza);
        raza.setVisible(true);
        
        hp= new JLabel();
        hp.setBounds(30, 300, 100, 30);
        hp.setText("HP: 35");
        contentpane.add(hp);
        hp.setVisible(true);
        
        mana= new JLabel();
        mana.setBounds(30, 320, 100, 30);
        mana.setText("Mana: 25");
        contentpane.add(mana);
        mana.setVisible(true);
        
        equipo1 = new JLabel();
        equipo1.setBounds(400, 50, 200, 30);
        equipo1.setText("arma principal");
        contentpane.add(equipo1);
        equipo1.setVisible(true);
        
        equipo2= new JLabel();
        equipo2.setBounds(400, 130, 200, 30);
        equipo2.setText("armadura");
        contentpane.add(equipo2);
        equipo2.setVisible(true);
        
        equipo3= new JLabel();
        equipo3.setBounds(400, 220, 200, 30);
        equipo3.setText("arma secundaria");
        contentpane.add(equipo3);
        equipo3.setVisible(true);
            
        JButton boton = new JButton("1");
        boton.setBounds(30, 50, 200, 200);
        ImageIcon imagen4 = new ImageIcon("Imagenes/humano.jpg");
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono4);
        contentpane.add(boton);
        
        JButton boton2 = new JButton();
        boton2 = new JButton("2");
        boton2.setBounds(250, 30, 80, 80);
        ImageIcon imagen = new ImageIcon("Imagenes/"+"baculo.jpg");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_DEFAULT));
        boton2.setIcon(icono);
        contentpane.add(boton2);

        JButton boton3 = new JButton();
        boton3 = new JButton("3");
        boton3.setBounds(250, 110, 80, 80);
        ImageIcon imagen3 = new ImageIcon("Imagenes/tunoca de cuervo.jpg");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_DEFAULT));
        boton3.setIcon(icono3);
        contentpane.add(boton3);
        
        JButton boton4 = new JButton();
        boton4 = new JButton("4");
        boton4.setBounds(250, 190, 80, 80);
        ImageIcon imagen2 = new ImageIcon("Imagenes/varita de sauco.jpg");
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_DEFAULT));
        boton4.setIcon(icono2);
        contentpane.add(boton4);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
}
