import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
*nota final redondeada a un decimal."
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio09 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double asistenciaMin;
        double notaAprobar = 7;
        double notaSupletorio = 4;
        double evaContinua, examenFinal, notaFinal;
        String estado;
        System.out.print("Ingrese nota de evaluacion continua (0 a 10): ");
        evaContinua = tcl.nextDouble();
        System.out.print("Ingrese nota del examen final (0 a 10): ");
        examenFinal = tcl.nextDouble ();
        System.out.print("Ingrese el porcentaje de asistencias (0 a 100): ");
        asistenciaMin = tcl.nextDouble();
        if (evaContinua < 0 || evaContinua > 10 || examenFinal < 0 || 
                examenFinal > 10 || asistenciaMin < 0 || asistenciaMin > 100)
        {
            System.out.println("Error: estos valores no estan dentro del "
                    + "rango");
        }
        else
        {
            notaFinal = (evaContinua * 0.40) + (examenFinal * 0.60);
            notaFinal = Math.round(notaFinal * 10.0) / 10.0;
            if (asistenciaMin < 70)
            {
                estado = "Reprobado";
            } 
            else 
            {
                if (notaFinal >= notaAprobar)
                {
                    estado = "Aprobado";
                } 
                else 
                {
                    if (notaFinal >= notaSupletorio) 
                    {
                            estado = "Supletorio";
                    } 
                    else 
                    {
                        estado = "Reprobado";
                    }
                }
                System.out.println("Estado academico: " + estado);
                System.out.println("Nota final: " + notaFinal);
            }
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese nota de evaluacion continua (0 a 10): 8
Ingrese nota del examen final (0 a 10): 9,4
Ingrese el porcentaje de asistencias (0 a 100): 80
Estado academico: Aprobado
Nota final: 8.8
BUILD SUCCESSFUL (total time: 12 seconds)
 */