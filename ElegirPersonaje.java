/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deusexmachina;

import java.awt.event.ActionEvent;
import pantallaEleccion.Interfaz;

/**
 *
 * @author PATICO
 */
public class ElegirPersonaje {
    
public void elegirPersonaje(String seleccion){
   
   CrearPersonaje exp = new CrearPersonaje();
   exp.crear(seleccion);
    
}
}
