/**
*Realiza un conversor de Mb a Kb.
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Mb: ");
    linea = System.console().readLine();
    double mb;
    mb = Double.parseDouble ( linea );
    int kb;
    kb = (int) (mb * 1024);
    System.out.println("Los megabites totales son "  + kb + " kb");
  }
}
