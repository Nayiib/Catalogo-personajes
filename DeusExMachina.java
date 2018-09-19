
package deusexmachina;

import fabricas.Cazador.FabricaCazadorE;
import fabricas.Cazador.FabricaCazadorH;
import fabricas.Cazador.FabricaCazadorO;
import fabricas.Guerrero.FabricaGuerreroElf;
import fabricas.Guerrero.FabricaGuerreroH;
import fabricas.Guerrero.FabricaGuerreroO;
import fabricas.Mago.FabricaMagoE;
import fabricas.Mago.FabricaMagoH;
import fabricas.Mago.FabricaMagoO;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import pantallaEleccion.SeleccionRaza;

public class DeusExMachina {
    private static Scanner S = new Scanner(System.in);


    public static void main(String[] args) {
        SeleccionRaza ventana = new SeleccionRaza();
        ventana.setVisible(true);
             
  

    }
}