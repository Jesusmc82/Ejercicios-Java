/**
* Escribe un programa que calcule el área de un triangulo.
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio06 {
  public static void main(String[] args) {
   String linea;
    System.out.print("¿Cuál es la base del triangulo?: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble ( linea );
    System.out.print("¿Cuál es la altura?: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble ( linea );
    double area;
    area = (double) ((base * altura) / 2);
    System.out.println("El area de tu triangulo es "  + area);    
  }
}
