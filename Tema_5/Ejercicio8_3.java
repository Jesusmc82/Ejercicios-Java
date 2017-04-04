/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * Añado hasta que número quiere conocer de la tabla de multiplicar de ese número
 * Con do-while
 * @author Jesus Martin Castro
 */
import java.util.Scanner;

public class Ejercicio8_3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Qué tabla de multiplicar desea saber.");
    System.out.print("\nIntroduzca ahora el número del que desea saber la tabla: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("\nHasta que numero quiere que multiplique: ");
    int repeticion = Integer.parseInt(s.nextLine());
    int multiplicador = 0;
    System.out.println("\nEsta es la Tabla de multiplicar de " + numero + ":\n");

    do {
      System.out.println(numero + " x " + multiplicador + "  = " + (numero * multiplicador) + " ");
      multiplicador = multiplicador + 1;
    } while (multiplicador <= repeticion);
  }
}
