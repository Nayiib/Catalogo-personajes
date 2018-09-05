/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallaEleccion;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author PATICO
 */
public class SeleccionArmasOrco extends JFrame implements ActionListener {

    JButton boton, boton2, boton3, boton4, boton5, boton6;
    ImageIcon imagen, imagen2, imagen3, imagen4, imagen5, imagen6;
    Icon icono, icono2, icono3, icono4, icono5, icono6;

    public SeleccionArmasOrco() {
        this.setBounds(0, 0, 1250, 400);
        this.setTitle("Seleccion de equipamiento");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        Container contentpane = getContentPane();
        contentpane.setLayout(null);
        this.setVisible(true);

        boton = new JButton("1");
        boton.setBounds(0, 30, 200, 200);
        imagen = new ImageIcon("Imagenes/baculo de craneo.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono);
        contentpane.add(boton);
        boton.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(210, 30, 200, 200);
        imagen2 = new ImageIcon("Imagenes/armadura maldita.jpg");
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_DEFAULT));
        boton2.setIcon(icono2);
        contentpane.add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(420, 30, 200, 200);
        imagen3 = new ImageIcon("Imagenes/escudo de dragon.png");
        icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_DEFAULT));
        boton3.setIcon(icono3);
        contentpane.add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("4");
        boton4.setBounds(630, 30, 200, 200);
        imagen4 = new ImageIcon("Imagenes/grimorio.jpg");
        icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_DEFAULT));
        boton4.setIcon(icono4);
        contentpane.add(boton4);

        boton5 = new JButton("5");
        boton5.setBounds(840, 30, 200, 200);
        imagen5 = new ImageIcon("Imagenes/hacha maldita.png");
        icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(boton5.getWidth(), boton5.getHeight(), Image.SCALE_DEFAULT));
        boton5.setIcon(icono5);
        contentpane.add(boton5);

        boton6 = new JButton("6");
        boton6.setBounds(1050, 30, 200, 200);
        imagen6 = new ImageIcon("Imagenes/guadaña.jpg");
        icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(boton6.getWidth(), boton6.getHeight(), Image.SCALE_DEFAULT));
        boton6.setIcon(icono6);
        contentpane.add(boton6);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        if (botonPulsado == boton) {
            Producto obj = new Producto();
            obj.setVisible(true);
        } else if (botonPulsado == boton2) {
            Producto obj = new Producto();
            obj.setVisible(true);
        } else if (botonPulsado == boton3) {
            Producto obj = new Producto();
            obj.setVisible(true);
        }
        dispose();
    }
}
