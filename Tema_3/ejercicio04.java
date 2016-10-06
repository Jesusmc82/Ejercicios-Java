/**
* Escribe un programa que sume, reste, multiplique y divida dos números
* introducidos por teclado.
* @author Jesus Martin Castro
*/

import java.util.Scanner;

public class ejercicio04 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Por favor, dinos cuál es tu primer número: ");
    linea = System.console().readLine();
    double primerNumero;
    primerNumero = Double.parseDouble ( linea );
    System.out.print("Ahora dinos cuál es tu segundo número: ");
    linea = System.console().readLine();
    double segundoNumero;
    segundoNumero = Double.parseDouble ( linea );
    double suma;
    suma = primerNumero + segundoNumero;
    System.out.println("El resultado de la suma es "  + suma);
    double resta;
    resta = primerNumero - segundoNumero;
    System.out.println("El resultado de la resta es "  + resta);
    double multiplicacion;
    multiplicacion = primerNumero * segundoNumero;
    System.out.println("El resultado de la multiplicacon es "  + multiplicacion);
    double division;
    division = primerNumero / segundoNumero;
    System.out.println("El resultado de la división es "  + division);
  }
}
