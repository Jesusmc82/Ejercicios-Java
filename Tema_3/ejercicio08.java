/**
* Escribe un programa que calcule el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio08 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Numero de horas que echó: ");
    linea = System.console().readLine();
    double numeroHoras;
    numeroHoras = Integer.parseInt ( linea );
    double sueldo;
    sueldo = (double)(numeroHoras * 12);
    System.out.printf("El sueldo total es de %.2f Euros", sueldo);
  }
}
