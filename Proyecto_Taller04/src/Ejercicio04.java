import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, 
 * el número de minutos consumidos en el mes."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double plantillaTel, costMin, minMes;
        System.out.println("Ingrese el costo por minutos: ");
        costMin = tcl.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en el mes");
        minMes = tcl.nextDouble();
        plantillaTel = costMin * minMes;
        System.out.println("La plantilla de telefono de su casa es: " + plantillaTel);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el costo por minutos: 
10
Ingrese el numero de minutos consumidos en el mes
100
La plantilla de telefono de su casa es: 1000.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */