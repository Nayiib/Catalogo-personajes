/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import deusexmachina.Clases;


public class GuerreroH implements Clases {

    @Override
    public String AsignarClase() {
        return "Paladin";
    }

    @Override
    public String AsignarArma() {
        return "espada bendita";
    }

    @Override
    public int AsignarMana() {
       return 10;
    }

    @Override
    public int AsignarHp() {
        return 50;
    }
         @Override
    public String AsignarArmaSec() {
        return "escudo de titanio";
    }

    @Override
    public String AsignarArmadura() {
        return "armadura de santo";
}
}
