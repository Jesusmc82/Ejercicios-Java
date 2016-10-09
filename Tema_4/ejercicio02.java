/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author Jesus Martin Castro
 */

public class ejercicio02 {
  public static void main(String[] args) {
    System.out.println("¿Qué hora es?");
    String linea = System.console().readLine();
    double n = Double.parseDouble( linea );
    
    if (( n >= 6 ) && ( n <= 12 )) {
      System.out.println("Buenos días");
    } else if (( n >= 13) && ( n <= 20 )) {
      System.out.println("Buenas tardes");
    } else {
      if ((( n >= 21 || n <= 24 )) && (( n >= 0 || n <= 5 )))
      System.out.println("Buenas noches");
    }
  }
}
