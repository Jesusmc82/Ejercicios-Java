/*
 *Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 *@Jesus Martin Castro
 */
//package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
    System.out.println("Veamos si es capaz de acertar la contraseña de la caja fuerte");
    Scanner s = new Scanner(System.in);
    int numeroIntento = 4;
    boolean acertado = false;
    int contrasena;
    do {
      System.out.println("Introduzca la contraseña:");
      contrasena = Integer.parseInt(s.nextLine());
      numeroIntento = numeroIntento - 1; //igual a numeroIntento
      if (numeroIntento == 0) {
        System.out.println("Ha superado el número de intentos");
      } else if (contrasena == 5555) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        acertado = true;
      } else {
        System.out.println("Lo siento, esa no es la combinación");
      }
    } while (numeroIntento > 0 && acertado == false);
  }

}
