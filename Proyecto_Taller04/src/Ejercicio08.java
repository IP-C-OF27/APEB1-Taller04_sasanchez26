import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio08 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double valorTotal, netflix, youtubePremium, dropbox, spotify;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese el valor mensual de Netflix: ");
        netflix = tcl.nextDouble();
        System.out.print("Ingrese el valor mensual de Youtube Premium: ");
        youtubePremium = tcl.nextDouble();
        System.out.print("Ingrese el valor mensual de Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.print("Ingrese el valor mensual de Spotify: ");
        spotify = tcl.nextDouble();
        valorTotal = netflix + youtubePremium + dropbox + spotify;
        if (edad <= 30)
        {
            valorTotal = valorTotal * 0.20;
        }
        System.out.println("El valor total a pagar mensual de servicios "
                + "digitales es: " + valorTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 18
Ingrese el valor mensual de Netflix: 7
Ingrese el valor mensual de Youtube Premium: 6
Ingrese el valor mensual de Dropbox: 10
Ingrese el valor mensual de Spotify: 3,5
El valor total a pagar mensual de servicios digitales es: 5.300000000000001
BUILD SUCCESSFUL (total time: 27 seconds)
 */