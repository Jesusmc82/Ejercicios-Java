/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * con for
 *
 * @author Jesus Martin Castro
 */
package ejercicio.pkg8_1;

import java.util.Scanner;

public class Ejercicio8_1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Qué tabla de multiplicar desea saber.");
    System.out.print("\nIntroduzca ahora el número del que desea saber la tabla: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("\nEsta es la Tabla de multiplicar de " + numero + ":\n");
    for (int multiplicador = 0; multiplicador <= 10; multiplicador = multiplicador + 1) {
      System.out.println(numero + " x " + multiplicador + "  = " + (numero * multiplicador) + " ");
    }
  }
}
