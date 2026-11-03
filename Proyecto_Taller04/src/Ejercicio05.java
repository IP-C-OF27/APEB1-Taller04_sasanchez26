import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio05 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double computadora, CPU, teclado, pantalla, raton;
        System.out.print("Ingrese el precio del CPU: $");
        CPU = tcl.nextDouble();
        System.out.print("Ingrese el precio del teclado: $");
        teclado = tcl.nextDouble();
        System.out.print("Ingrese el precio de la pantalla: $");
        pantalla = tcl.nextDouble();
        System.out.print("Ingrese el precio del raton: $");
        raton = tcl.nextDouble();
        computadora = CPU + teclado + pantalla + raton;
        System.out.println("El costo total de la computadora de escritorio es: "
                + "$" + computadora);
    }       
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el precio del CPU: $200
Ingrese el precio del teclado: $20,50
Ingrese el precio de la pantalla: $50
Ingrese el precio del raton: $15
El costo total de la computadora de escritorio es: $285.5
BUILD SUCCESSFUL (total time: 45 seconds)
 */