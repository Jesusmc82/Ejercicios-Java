/**
* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
* con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
* convertir un entero en un carácter.
*
* @author Jesus Martin Castro
*/
public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException {
    
    String verde = "\033[32m";
    
    for (int i=0; i<600000; i++) {
      System.out.print(verde);
      System.out.print((char)((int)(Math.random()*94) + 32));
      Thread.sleep(3);
    }
  }
}
