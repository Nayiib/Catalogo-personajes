/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallaEleccion;


import deusexmachina.ElegirPersonaje;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author PATICO
 */
public class Interfaz extends JFrame implements ActionListener{

    JButton boton, boton2, boton3, boton4, boton5, boton6;
    ImageIcon imagen, imagen2, imagen3, imagen4, imagen5, imagen6;
    Icon icono, icono2, icono3, icono4, icono5, icono6;
    JTextField txt1,txt2,txt3;
    public Interfaz() {
        this.setBounds(0, 0, 650, 400);
        this.setTitle("Seleccion de personaje");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        Container contentpane = getContentPane();
        contentpane.setLayout(null);
        this.setVisible(true);
        
        txt1 = new JTextField();
        txt1.setBounds(90, 250, 30, 30);
        contentpane.add(txt1);
        
        txt2 = new JTextField();
        txt2.setBounds(300, 250, 30, 30);
        contentpane.add(txt2);
        
        txt3 = new JTextField();
        txt3.setBounds(500, 250, 30, 30);
        contentpane.add(txt3);
        
        boton = new JButton("1");
        boton.setBounds(0, 30, 200, 200);
        imagen = new ImageIcon("Imagenes/humano.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono);
        contentpane.add(boton);
        boton.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(210, 30, 200, 200);
        imagen2 = new ImageIcon("Imagenes/elfo.jpg");
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_DEFAULT));
        boton2.setIcon(icono2);
        contentpane.add(boton2);
         boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(420, 30, 200, 200);
        imagen3 = new ImageIcon("Imagenes/orco.jpg");
        icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_DEFAULT));
        boton3.setIcon(icono3);
        contentpane.add(boton3);
         boton3.addActionListener(this);
        /*
        boton4 = new JButton("4");
        boton4.setBounds(0, 100, 80, 80);
        contentpane.add(boton4);

        boton5 = new JButton("5");
        boton5.setBounds(100, 100, 80, 80);
        contentpane.add(boton5);

        boton6 = new JButton("6");
        boton6.setBounds(200, 100, 80, 80);
        contentpane.add(boton6);*/

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ElegirPersonaje n = new ElegirPersonaje();
        Object botonPulsado = e.getSource();
        String x;
        
        
        if (botonPulsado==boton){
         x=this.boton.getText();
         this.txt1.setText(x);
         n.elegirPersonaje(x);
         SeleccionArmasHumano obj= new SeleccionArmasHumano();
        obj.setVisible(true);
            
        }
        else if(botonPulsado==boton2){
         x=this.boton2.getText();
         this.txt2.setText(x);
         SeleccionArmasElfo obj = new SeleccionArmasElfo();
         obj.setVisible(true);
        }
        else if(botonPulsado==boton3){
         x=this.boton3.getText();
         this.txt3.setText(x);
         SeleccionArmasOrco obj = new SeleccionArmasOrco();
         obj.setVisible(true);
        }
        dispose();
    }

    
}
