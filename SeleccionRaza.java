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
import javax.swing.JTextField;

/**
 *
 * @author PATICO
 */
public class SeleccionRaza extends JFrame implements ActionListener {

    JButton botonHumano, botonElfo, botonOrco;
    ImageIcon imagen, imagen2, imagen3, imagen4, imagen5, imagen6;
    Icon icono, icono2, icono3, icono4, icono5, icono6;
    JTextField txt1, txt2, txt3;
    
    public SeleccionRaza() {
        
        this.setBounds(0, 0, 650, 400);
        this.setTitle("Seleccion de Raza");
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

        botonHumano = new JButton("Humano");
        botonHumano.setBounds(0, 30, 200, 200);
        imagen = new ImageIcon("Imagenes/humano.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(botonHumano.getWidth(), botonHumano.getHeight(), Image.SCALE_DEFAULT));
        botonHumano.setIcon(icono);
        contentpane.add(botonHumano);
        botonHumano.addActionListener(this);

        botonElfo = new JButton("Elfo");
        botonElfo.setBounds(210, 30, 200, 200);
        imagen2 = new ImageIcon("Imagenes/elfo.jpg");
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(botonElfo.getWidth(), botonElfo.getHeight(), Image.SCALE_DEFAULT));
        botonElfo.setIcon(icono2);
        contentpane.add(botonElfo);
        botonElfo.addActionListener(this);

        botonOrco = new JButton("Orco");
        botonOrco.setBounds(420, 30, 200, 200);
        imagen3 = new ImageIcon("Imagenes/orco.jpg");
        icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(botonOrco.getWidth(), botonOrco.getHeight(), Image.SCALE_DEFAULT));
        botonOrco.setIcon(icono3);
        contentpane.add(botonOrco);
        botonOrco.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        String recibirClick;
        

        if (botonPulsado == botonHumano) {
            recibirClick = this.botonHumano.getText();
            SeleccionClase obj = new SeleccionClase();
            obj.setClase(recibirClick);
         

        } else if (botonPulsado == botonElfo) {
            recibirClick = this.botonElfo.getText();
            SeleccionClase obj = new SeleccionClase();
            obj.setClase(recibirClick);
           
        } else if (botonPulsado == botonOrco) {
            recibirClick = this.botonOrco.getText();
            SeleccionClase obj = new SeleccionClase();
            obj.setClase(recibirClick);
            //obj.setVisible(true);
        }
        dispose();
    }

}
