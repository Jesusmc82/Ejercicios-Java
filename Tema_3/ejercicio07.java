/**
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible.
* 
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio07 {
  public static void main(String[] args) {
   String linea;
    System.out.print("¿Qué precio tiene el producto?: ");
    linea = System.console().readLine();
    double precio;
    precio = Double.parseDouble ( linea );
    double primerPorcentaje;
    primerPorcentaje = (double) (precio * 1.04);
    System.out.println("El precio con el 4% de IVA es " + primerPorcentaje);
    primerPorcentaje = (double) (precio * 1.10);
    System.out.println("El precio con el 10% de IVA es "  + primerPorcentaje);
    primerPorcentaje = (double) (precio * 1.21);
    System.out.println("El precio con el 21% de IVA es "  + primerPorcentaje);
  }
}
