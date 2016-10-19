/**
 *
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Jesus Martin Castro
 */
 
public class Ejercicio18 {
  public static void main(String[] args) {

    System.out.println("Dígame un número entero y yo le mostraré el primer número de esa cifra");
    System.out.print("El número máximo de cifras que puede contener son 5, vamos a ello: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10) {
      System.out.println("Al ser solo un número, la cifra es: " + numero);
    } else if ((numero >=10) && (numero <=99)) {
      System.out.println("El primero de los números es: " + (numero / 10));
    } else if ((numero >=100) && (numero <=999)) {
      System.out.println("El primero de los números es: " + (numero / 100));
    } else if ((numero >=1000) && (numero <=9999)) {
      System.out.println("El primero de los números es: " + (numero / 1000));
    } else if ((numero >=10000) && (numero <=99999)) {
      System.out.println("El primero de los números es: " + (numero / 10000));
    } else {
      System.out.println("Ese número no lo entiendo, lo siento.");
    }
  }
}
