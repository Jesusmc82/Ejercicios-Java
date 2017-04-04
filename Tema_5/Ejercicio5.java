/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 *
 * @Jesus Martin Castro
 */
//package ejercicio5;

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar los números del 320 al 160 reduciendo de 20 en 20:");

    int i = 320;

    while (i >= 160) {
      System.out.println(i);

      i = i - 20;
    }
  }
}
