
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class CazadorH implements Clases {

    @Override
    public String AsignarClase() {
        return "Cazador";
    }

    @Override
    public String AsignarArma() {
        return "Ballesta rustica";
    }

    @Override
    public int AsignarMana() {
       return 15;
    }

    @Override
    public int AsignarHp() {
        return 45;
    }

     @Override
    public String AsignarArmaSec() {
        return "daga";
    }

    @Override
    public String AsignarArmadura() {
        return "se equipa como armadura chaleco de cuero";
    }
}
