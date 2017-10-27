/**
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 {
  public static void main(String[] args) {
      
    System.out.print("Vamos a conocer los números multiplos de 5 desde el 0 al 100");
      String Linea= System.console().readLine();
      
    for (int multiplo = 0; multiplo <= 20; multiplo++) {
        
          int numero = multiplo * 5;
      
      System.out.println(multiplo + " * 5 = " + numero);
      
    }
  }
}
