/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * @author Jesus Martin Castro
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    double euros = 78;
    int pesetas = (int) (euros * 166.386);
    String miFrase = "La cantidad de ";

    System.out.println(miFrase + euros + " euros son " + pesetas + " pesetas.");
  }
}
