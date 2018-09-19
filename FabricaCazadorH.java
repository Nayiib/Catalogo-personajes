/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas.Cazador;

import deusexmachina.Clases;
import deusexmachina.Fabrica;
import productos.CazadorH;

/**
 *
 * @author overkill
 */
public class FabricaCazadorH implements Fabrica {

    @Override
    public Clases CrearClase() {
     return new CazadorH();
    }
    
}
