/**
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio17 {
  public static void main(String[] args) {
  
    System.out.println("Dígame un número y sacaré la última cifra.");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 0) {
      System.out.println("El " + numero + " tiene como última cifra " + (-numero % 10));
    } else {
      System.out.println("El " + numero + " tiene como última cifra " + numero % 10);
    }
  }
}
