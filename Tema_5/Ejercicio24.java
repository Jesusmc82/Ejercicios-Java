/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *
 * @Jesus Martin Castro
 */

import java.util.Scanner;
public class Ejercicio24 {
 public static void main(String arg[]){
  
    System.out.println("Diga un número determinado de filas para pintar una pirámide");
    
    Scanner n = new Scanner(System.in);
    
    System.out.println("\nIntroduzca el número: ");
    
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < altura; i++) {
      System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
