
package productos;

import deusexmachina.Clases;

public class CazadorE  implements Clases{

     @Override
    public String AsignarClase() {
        return "Explorador";
    }

    @Override
    public String AsignarArma() {
       return "arco de abedul";
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
        return "athame";
    }

    @Override
    public String AsignarArmadura() {
        return "seda";
    }
    
}
