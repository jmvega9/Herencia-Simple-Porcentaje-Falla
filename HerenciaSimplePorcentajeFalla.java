/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasimpleporcentajefalla;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.Scanner;
class Falla{
    double porcentaje_fuga;
    double sensor_temperatura;
    double sensor_presion;

    void MostrarCaracteristicasFalla(){
    System.out.println("El porcentaje de fuga de aire más la falla en los "
            +"sensores es: "+porcentaje_fuga+"%\nLa falla en el sensor de "
                    + "Temperatura es de: "+sensor_temperatura+"%"+"\nLa falla en "
                            + "el sensor es de Presión es de: "+sensor_presion);
    }
}
//herencia simple: Una subclase de Fllas es FugaAire
class FugaAire extends Falla
{
    String tipo;

    double CalcularFalla(){
    return porcentaje_fuga-sensor_temperatura-sensor_presion;
    }
    void mostrarTipo(){
        System.out.println("El tipo de falla es: "+tipo);
    }
}
//herencia simple: Una subclase de Fllas es FallaSensor
class SensorTemperatura extends Falla{
    String tipo;

    double CalcularFalla(){
    return porcentaje_fuga-sensor_temperatura-sensor_presion;
    }
    void mostrarTipo(){
        System.out.println("El tipo de falla es: "+tipo);
    }
}
class SensorPresion extends Falla{
    String tipo;

    double CalcularFalla(){
    return porcentaje_fuga-sensor_temperatura-sensor_presion;
    }
    void mostrarTipo(){
        System.out.println("El tipo de falla es: "+tipo);
    }
}
public class HerenciaSimplePorcentajeFalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Caratula
       System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
       System.out.println("               Ingeniería  Automotriz ");
       System.out.println("           Vega Masapanta Jessica Maribel");
       System.out.println("         Programación Orientada  a Objetos ");
       System.out.println("                        7450 ");
       System.out.println("              Ing. Luis Alberto Guerra \n");
       System.out.println("           \t Herencia Simple \n");

       FugaAire fuga1=new FugaAire();
       SensorTemperatura falla1=new SensorTemperatura();
       SensorPresion falla2=new SensorPresion();

       fuga1.porcentaje_fuga=50;
       fuga1.sensor_temperatura=5;
       fuga1.sensor_presion=35;
       fuga1.tipo="Válvula EGR atascada";

       falla1.porcentaje_fuga=60;
       falla1.sensor_temperatura=15;
       falla1.sensor_presion=25;
       falla1.tipo="Sensor de temperatura sin funcionamiento";

       falla2.porcentaje_fuga=75;
       falla2.sensor_temperatura=25;
       falla2.sensor_presion=15;
       falla2.tipo="Sensor de presion sin funcionamiento";

       System.out.println("La información de falla en el colector de admisión y escape es: ");
       fuga1.mostrarTipo();
       fuga1.MostrarCaracteristicasFalla();
       System.out.println("El porcentaje de fuga es de: "+fuga1.CalcularFalla()+"%\n");
       System.out.println();

       System.out.println("La información de falla en el sistema de refrigeración es: ");
       falla1.mostrarTipo();
       falla1.MostrarCaracteristicasFalla();
       System.out.println("El porcentaje de fuga es de: "+falla1.CalcularFalla()+"%\n");

       System.out.println("La información de falla en el sistema de lubricación es: ");
       falla2.mostrarTipo();
       falla2.MostrarCaracteristicasFalla();
       System.out.println("El porcentaje de fuga es de: "+falla2.CalcularFalla()+"%");
    }
}
