/**
*Realiza un conversor de Kb a Mb.
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Kb: ");
    linea = System.console().readLine();
    double kb;
    kb = Double.parseDouble ( linea );
    double mb;
    mb = (double) (kb / 1024);
    System.out.println("Los kilobites totales son "  + mb + " mb");
  }
}
