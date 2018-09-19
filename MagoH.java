
package productos;

import deusexmachina.Clases;

public class MagoH implements Clases 
{
    @Override
    public String AsignarClase() {
        return "archimago";
    }

    @Override
    public String AsignarArma() {
        return "varita se sauco";
    }

    @Override
    public int AsignarMana() {
       return 35;
    }

    @Override
    public int AsignarHp() {
     return 25;
    }
    @Override
    public String AsignarArmaSec() {
       return "baculo";
    }

    @Override
    public String AsignarArmadura() {
        return "tunica de cuervo";
    }

    
}
