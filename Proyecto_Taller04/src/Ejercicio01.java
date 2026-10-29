import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Deme la base: ");
        base = tcl.nextDouble();
        System.out.print("Deme la altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) /2;
        System.out.println("Area: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme la base: 7
Deme la altura: 10
Area: 35.0
BUILD SUCCESSFUL (total time: 26 seconds)
 */