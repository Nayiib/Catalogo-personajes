/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas.Guerrero;

import deusexmachina.Clases;
import deusexmachina.Fabrica;
import productos.GuerreroE;

/**
 *
 * @author overkill
 */
public class FabricaGuerreroElf implements Fabrica {

    @Override
    public Clases CrearClase() {
         return new GuerreroE();
    }
    
}
