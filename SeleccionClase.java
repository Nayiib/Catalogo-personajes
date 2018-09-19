/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallaEleccion;

import deusexmachina.CrearPersonaje;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author PATICO
 */
public class SeleccionClase extends JFrame implements ActionListener {

    JButton botonMago, botonGuerrero, botonCazador;
    String clase;

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public SeleccionClase() {

        this.setBounds(0, 0, 650, 400);
        this.setTitle("Seleccion de Clase");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        Container contentpane = getContentPane();
        contentpane.setLayout(null);
        this.setVisible(true);

        botonMago = new JButton("Mago");//mago
        botonMago.setBounds(0, 30, 200, 200);
        /*imagen = new ImageIcon("Imagenes/arco de abedul.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(botonMago.getWidth(), botonMago.getHeight(), Image.SCALE_DEFAULT));
        botonMago.setIcon(icono);*/
        contentpane.add(botonMago);
        botonMago.addActionListener(this);

        botonGuerrero = new JButton("Guerrero");//guerrero
        botonGuerrero.setBounds(210, 30, 200, 200);
        /*imagen2 = new ImageIcon("Imagenes/armadura de santo.jpg");
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(botonGuerrero.getWidth(), botonGuerrero.getHeight(), Image.SCALE_DEFAULT));
        botonGuerrero.setIcon(icono2);*/
        contentpane.add(botonGuerrero);
        botonGuerrero.addActionListener(this);

        botonCazador = new JButton("Cazador");//cazador
        botonCazador.setBounds(420, 30, 200, 200);
        /*imagen3 = new ImageIcon("Imagenes/arco largo.png");
        icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(botonCazador.getWidth(), botonCazador.getHeight(), Image.SCALE_DEFAULT));
        botonCazador.setIcon(icono3);*/
        contentpane.add(botonCazador);
        botonCazador.addActionListener(this);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        CrearPersonaje cp = new CrearPersonaje();
        String x;

        if (botonPulsado == botonMago) {
            Producto obj = new Producto();
            x = this.botonMago.getText();
            
            
            cp.crear( clase,x);
        

        } else if (botonPulsado == botonGuerrero) {
            Producto obj = new Producto();
            x = this.botonGuerrero.getText();
            
            cp.crear(clase,x);
        
        } else if (botonPulsado == botonCazador) {
            Producto obj = new Producto();
            x = this.botonCazador.getText();
            
            cp.crear(clase,x);
           
        }
        dispose();
    }
}
