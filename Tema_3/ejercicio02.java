/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
* convertir debe ser introducida por teclado.
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio02 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Introduce la cantidad de Euros: ");
    linea = System.console().readLine();
    double euros;
    euros = Double.parseDouble ( linea );
    int total;
    total = (int) (euros * 166.386);
    System.out.print("La cantidad de " + euros + " Euros");
    System.out.print(" son " + total + " Pesetas");
  }
}
