import java.util.Scanner;
/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double pagoMensual, prestamo, interesCobrar;
        int meses = 12;
        System.out.print("Ingrese el monto del prestamo: $");
        prestamo = tcl.nextDouble();
        System.out.print("Ingrese el interes mensual a cobrar: " + "%");
        interesCobrar = tcl.nextDouble();
        pagoMensual = (prestamo / meses) + (prestamo * (interesCobrar / 100));
        System.out.println("El pago mensual de un prestamo de 1 anio de plazo "
                + "es: $" + pagoMensual + " mensualmente");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese el monto del prestamo: $2000
Ingrese el interes mensual a cobrar: %14
El pago mensual de un prestamo de 1 anio de plazo es: $446.66666666666663 
* mensualmente
BUILD SUCCESSFUL (total time: 9 seconds)
 */