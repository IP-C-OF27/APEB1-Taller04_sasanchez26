import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor 
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio07 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double planillaLuz, costoKhora, kilovatiosMes;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese el valor de costo por kilovatio/hora: ");
        costoKhora = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el "
                + "mes: ");
        kilovatiosMes = tcl.nextDouble();
        planillaLuz = costoKhora * kilovatiosMes;
        if (edad >= 65)
        {
            planillaLuz = planillaLuz - (planillaLuz * 0.10);
        }
        System.out.println("El valor a cancelar de una planilla de luz es :" 
                + planillaLuz);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 67
Ingrese el valor de costo por kilovatio/hora: 0,75
Ingrese el numero de kilovatios consumidos en el mes: 400
El valor a cancelar de una planilla de luz es :270.0
BUILD SUCCESSFUL (total time: 21 seconds)
 */