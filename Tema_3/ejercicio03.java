/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
* convertir debe ser introducida por teclado.
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio03 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Introduce la cantidad de Pesetas: ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt ( linea );
    double total;
    total = (double)(pesetas / 166.386);
    System.out.print("La cantidad de " + pesetas + " Pesetas");
    System.out.printf(" son %3.2f Euros",  total);
  }
}
