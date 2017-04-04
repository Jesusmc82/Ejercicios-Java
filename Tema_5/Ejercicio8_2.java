/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * Con while
 *
 * @author Jesus Martin Castro
 */
package ejercicio.pkg8_2;

import java.util.Scanner;

public class Ejercicio8_2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Qué tabla de multiplicar desea saber.");
    System.out.print("\nIntroduzca ahora el número del que desea saber la tabla: ");
    int numero = Integer.parseInt(s.nextLine());
    int multiplicador = 0;
    System.out.println("\nEsta es la Tabla de multiplicar de " + numero + ":\n");
    while (multiplicador <= 10) {
      System.out.println(numero + " x " + multiplicador + "  = " + (numero * multiplicador) + " ");
      multiplicador = multiplicador + 1;
    }
  }
}
