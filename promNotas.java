package Quiz;

/**
 * Nombre del programa: Leer notas de varios estudiantes
 * Descripcion: Leer, mientras se desee continuar, las notas de varios estudiantes de un curso 
    y al final imprimir el promedio general de todas las notas de los estudiantes.
 * Autor: Kimberly C.
 * Fecha de creacion: 2-7-20
 * Modificado por: Kimberly C.
 * fecha de modificacion: 2-7-20
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class quiz2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        //Declaracion de variables
        int nota;
        int promedio;
        int continuar=1;
        int sumaNotas=0;
        int count=0;

        while (continuar == 1){
            escribir.println("Digite la nota del estudiante:");
            nota = Integer.parseInt(leer.readLine());

            sumaNotas = sumaNotas + nota;
            count++;

            escribir.println("Digite 1 si desea continuar, de lo contrario digite 2");
            continuar = Integer.parseInt(leer.readLine());
            
        } 
    
        promedio = sumaNotas / count;
        escribir.println("El promedio de las notas es de: " + promedio);
        

    } //Fin del Main
}//Fin del Class