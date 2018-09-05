/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author CAR105
 */
public class CrearPersonaje {

    public void crear(String h) {
        switch (h) {
            case "1":
                switch (h) {
                    case "1":
                        Stats(new FabricaGuerreroH());
                        break;
                    case "2":
                        Stats(new FabricaMagoH());
                        break;
                    case "3":
                        Stats(new FabricaCazadorH());
                        break;
                }

                break;
            /*case 2:
                switch (clase) {
                    case 1:
                        Stats(new FabricaGuerreroElf());
                        break;
                    case 2:
                        Stats(new FabricaMagoE());
                        break;
                    case 3:
                        Stats(new FabricaCazadorE());
                }
            case 3:
                switch (clase) {
                    case 1:
                        Stats(new FabricaGuerreroO());
                        break;
                    case 2:
                        Stats(new FabricaMagoO());
                        break;
                    case 3:
                        Stats(new FabricaCazadorO());
                        break;
                }
                break;
           */ default:
                System.out.println("Se ha ingresado una opción inválida.");
        }
        System.out.print("\n");

    }

    public static void Stats(Fabrica factory) {
        Clases clase = factory.CrearClase();
        clase.AsignarClase();
        clase.AsignarArma();
        clase.AsignarMana();
        clase.AsignarHp();
        clase.AsignarArmaSec();
        clase.AsignarArmadura();
    }
}

