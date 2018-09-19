package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class MagoE implements Clases {

    @Override
    public String AsignarClase() {
        return "Druida";
    }

    @Override
    public String AsignarArma() {
        return "Grimorio";
    }

    @Override
    public int AsignarMana() {
       return 40;
    }

    @Override
    public int AsignarHp() {
        return 20;
    
}

    @Override
    public String AsignarArmaSec() {
       return "cayado";
    }

    @Override
    public String AsignarArmadura() {
        return "tunica del bosque";
    }
}