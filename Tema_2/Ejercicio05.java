/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * @author Jesus Martin Castro
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    int pesetas = 83300;
    double euros = (double) (pesetas / 166.386);
    String miFrase = "La cantidad de ";

    System.out.println(miFrase + pesetas + " pesetas son " + euros + " euros.");
  }
}
