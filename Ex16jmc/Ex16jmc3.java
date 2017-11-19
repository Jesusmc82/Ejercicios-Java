/**
* Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
* usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5.
* Ejemplo 1:
* Introduzca la longitud del lado (5 como mínimo): 6
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ex16jmc3 {
  public static void main(String[] args) { 
    System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
    int lado = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int numCaracteres = 1;
    System.out.println();
    int espacio = lado - 4;
    
    for (int i = 1; i <= lado; i++) {
        System.out.print("*");
    }
    
    System.out.println(" ");
    altura++;
    for (int j = 1; j <= lado; j++) {
        System.out.print("*");
    }
    
    System.out.println(" ");
    altura++;
    
    do {
      
        System.out.print("**");
      
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      
        System.out.print("**");
      
      System.out.println();
     
     altura++;
  
    }while (altura < lado-1);
    
    for (int i = 1; i <= lado; i++) {
        System.out.print("*");
    }
    
    System.out.println(" ");

    for (int j = 1; j <= lado; j++) {
        System.out.print("*");
    }
    
  }
}
