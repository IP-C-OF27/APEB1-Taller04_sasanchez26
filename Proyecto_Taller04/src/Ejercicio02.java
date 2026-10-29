import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1, gastoHijo2, gastoHijo3, gastoTotal;
        System.out.print("Deme los gastos:");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        gastoTotal = (gastoHijo1 + gastoHijo2 + gastoHijo3);
        System.out.println("Los gastos totales son: " + gastoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme los gastos: 100 20 40
Los gastos totales son: 160.0
BUILD SUCCESSFUL (total time: 16 seconds)
 */