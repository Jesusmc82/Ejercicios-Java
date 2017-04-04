/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 *
 *@Jesus Martin Castro
 */
package ejercicio6;

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar los números del 320 al 160 reduciendo de 20 en 20:");
    int i = 320;

    do {
      System.out.println(i);
      i = i - 20;
    } while (i >= 160);
  }
}
