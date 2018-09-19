
package productos;

import deusexmachina.Clases;


public class GuerreroO implements Clases {

   @Override
    public String AsignarClase() {
        return "AntiPaladin";
    }

    @Override
    public String AsignarArma() {
        return "hacha maldita";
    }

    @Override
    public int AsignarMana() {
       return 5;
    }

    @Override
    public int AsignarHp() {
        return 55;
    }

    @Override
    public String AsignarArmaSec() {
        return "escudo de dragon";
    }

    @Override
    public String AsignarArmadura() {
        return "armadura maldita";
    }
    
}
