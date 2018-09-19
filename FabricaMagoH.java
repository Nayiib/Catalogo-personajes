
package fabricas.Mago;

import deusexmachina.Clases;
import deusexmachina.Fabrica;
import productos.MagoH;



public class FabricaMagoH  implements Fabrica{

@Override
    public Clases CrearClase() {
   return new MagoH();
}
}



