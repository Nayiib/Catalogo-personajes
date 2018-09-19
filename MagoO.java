/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class MagoO implements Clases {

    @Override
    public String AsignarClase() {
        return "brujo";
    }

    @Override
    public String AsignarArma() {
        return "baston de craneo";
    }

    @Override
    public int AsignarMana() {
       return 30;
    }

    @Override
    public int AsignarHp() {
        return 30;
    }
        @Override
    public String AsignarArmaSec() {
       return "guadaña";
    }

    @Override
    public String AsignarArmadura() {
        return "atuendo cultista";
    }
}

