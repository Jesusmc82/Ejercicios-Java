/**
 *
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Jesus Martin Castro
 */
 
public class Ejercicio20 {
  public static void main(String[] args) {
    
    int numero;
    boolean capicua = false;
    
    System.out.println("¿Quiere saber si su número es capicúo?");
    System.out.println("Introduzcalo, máximo 5 dígitos: ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero < 10) {
      capicua = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && (((numero / 100 ) % 10)== ((numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El " + numero + " si es capicúo");
    } else {
      System.out.println("El " + numero + " no es capicúo");
    }
  }
}
