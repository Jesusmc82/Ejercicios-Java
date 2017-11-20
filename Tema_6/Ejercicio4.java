/**
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
* rados por espacios.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.print("Le mostraré 20 números de manera aleatoria entre el 0 y el 10:");
    String salto = System.console().readLine();
        
    for (int j = 1; j <= 20; j++) {
    int numerosAleatorios = (int)(Math.random()*11);
    System.out.print(" " + numerosAleatorios);
    }
  }
}
