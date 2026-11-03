import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se 
 * pide que haga un programa que calcule el área total.
Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
* la medida de uno de sus lados."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio10 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, areaA, areaBCE, areaD,areaTotal;
        System.out.print("Ingrese el valor del lado: ");
        lado = tcl.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        altura = tcl.nextDouble();
        areaA = lado * lado;
        System.out.println("El area del cuadrado perfecto es: " + areaA);
        areaBCE = 3 * (lado * altura) / 2;
        System.out.println("El area de los triangulos rectangulos es: " + 
                areaBCE);
        areaD = lado * altura;
        System.out.println("El area del rectangulo es: " + areaD);
        areaTotal = areaA + areaBCE + areaD;
        System.out.println("El area total del poligono es: " + areaTotal); 
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el valor del lado: 5
Ingrese el valor de la altura: 8
El area del cuadrado perfecto es: 25.0
El area de los triangulos rectangulos es: 60.0
El area del rectangulo es: 40.0
El area total del poligono es: 125.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */