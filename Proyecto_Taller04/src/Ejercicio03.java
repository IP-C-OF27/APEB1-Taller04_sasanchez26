import java.util.Scanner;
/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la 
 * tabla de multiplicar de un número ingresado por el usuario; solo en el caso 
 * que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numTab;
        System.out.println("Ingrese un numero entre 2 y 6: ");
        numTab = tcl.nextInt();
        if (numTab >=2 && numTab <=6){
            System.out.println(numTab + " x 1 = " + (numTab * 1));
            System.out.println(numTab + " x 2 = " + (numTab * 2));
            System.out.println(numTab + " x 3 = " + (numTab * 3));
            System.out.println(numTab + " x 4 = " + (numTab * 4));
            System.out.println(numTab + " x 5 = " + (numTab * 5));
            System.out.println(numTab + " x 6 = " + (numTab * 6));
            System.out.println(numTab + " x 7 = " + (numTab * 7));
            System.out.println(numTab + " x 8 = " + (numTab * 8));
            System.out.println(numTab + " x 9 = " + (numTab * 9));
            System.out.println(numTab + " x 10 = " + (numTab * 10));
            System.out.println(numTab + " x 11 = " + (numTab * 11));
            System.out.println(numTab + " x 12 = " + (numTab * 12));
        }  
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero entre 2 y 6: 
5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
5 x 11 = 55
5 x 12 = 60
BUILD SUCCESSFUL (total time: 2 seconds)
 */