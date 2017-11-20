/**
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.print("Le mostraré 50 números de manera aleatoria entre el 100 y el 199:");
    String salto = System.console().readLine();
        
    for (int j = 1; j <= 50; j++) {
    int numerosAleatorios = (int)(Math.random()*100) + 100;
    System.out.print(" " + numerosAleatorios);
    }
  }
}
