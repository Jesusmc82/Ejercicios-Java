/**
* Muestra la tabla de multiplicar de un número introducido por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio8{
  public static void main(String[] args) {
      
    System.out.print("¿De qué numero desea conocer su tabla de multiplicar?: ");
      
      int multiplicador = Integer.parseInt(System.console().readLine());
    
    for( int multiplicando = 0; multiplicando <= 10; multiplicando ++) {
      
      int producto = multiplicando * multiplicador;
      
      System.out.println(multiplicando + " * " + multiplicador + " = " + producto); 
    }
  }
}
