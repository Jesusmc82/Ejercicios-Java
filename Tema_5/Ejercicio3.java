/**
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 {
  public static void main(String[] args) {
      
    System.out.print("Vamos a conocer los números multiplos de 5 desde el 0 al 100");
      String Linea= System.console().readLine();
      
      int multiplo = 0;
    
    do {                
        int numero = multiplo * 5;
      
      System.out.println(multiplo + " * 5 = " + numero);
      
        multiplo++;
    
    } while (multiplo <= 20);
  }
}
