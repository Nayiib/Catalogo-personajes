
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class CazadorO implements Clases{

     @Override
    public String AsignarClase() {
        return "Exterminador";
    }

    @Override
    public String AsignarArma() {
        return "Arco largo";
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
        return "cerbatana";
    }

    @Override
    public String AsignarArmadura() {
        return "piel de jabali";
    }
}
