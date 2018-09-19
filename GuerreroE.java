
package productos;

import deusexmachina.Clases;

public class GuerreroE implements Clases {

   @Override
    public String AsignarClase() {
        return "Aladid";
    }

    @Override
    public String AsignarArma() {
        return "Crissaegrim";
    }

    @Override
    public int AsignarMana() {
       return 20;
    }

    @Override
    public int AsignarHp() {
        return 40;
    }
         @Override
    public String AsignarArmaSec() {
        return "lorian";
    }

    @Override
    public String AsignarArmadura() {
        return "chaleco ligero";
    }
}
