/**
* Escribe un programa que calcule el área de un rectángulo.
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio05 {
  public static void main(String[] args) {
   String linea;
    System.out.print("¿Cuál es la base del rectangulo?: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt ( linea );
    System.out.print("¿Cuál es la altura?: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt ( linea );
    int area;
    area = base * altura;
    System.out.println("El area de tu rectangulo es "  + area);
    
  }
}
