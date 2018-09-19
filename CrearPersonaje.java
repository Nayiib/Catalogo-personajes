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

    public void crear(String raza, String clase) {

        switch (raza) {
            case "Humano":

                switch (clase) {
                    case "Mago":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaGuerreroH());

                        break;
                    case "Guerrero":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaMagoH());

                        break;
                    case "Cazador":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaCazadorH());

                        break;
                }

                break;
            case "Elfo":

                switch (clase) {
                    case "Mago":

                        Stats(new FabricaGuerreroElf());
                        break;
                    case "Guerrero":

                        Stats(new FabricaMagoE());
                        break;
                    case "Cazador":

                        Stats(new FabricaCazadorE());
                }
            case "Orco":

                switch (clase) {
                    case "Mago":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaGuerreroO());

                        break;
                    case "Guerrero":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaMagoO());

                        break;
                    case "Cazador":
                        System.out.println("Se ha creado el personaje con raza :" + raza + " y clase: " + clase);
                        Stats(new FabricaCazadorO());

                        break;
                }
                break;
            default:
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
