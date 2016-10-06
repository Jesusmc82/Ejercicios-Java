/**
*Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3πr2h
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio09 {
  public static void main(String[] args) {
   String linea;
    System.out.print("¿Cuál es la base del cono?: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble ( linea );
    System.out.print("¿Cuál es la altura?: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble ( linea );
    double volumen;
    volumen = (double) (3.1416 * base * base * altura / 3);
    System.out.printf("El volumen del cono es %.2f", volumen);
  }
}
