/**
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado. 
*
* @author Jesus Martin Castro
*/
public class Ejercicio9 {
  public static void main(String[] args) {
  
  int contador = 0;
  int numeroAleatorio = 0;
  
  while (numeroAleatorio != 24) {
    numeroAleatorio = (int)(Math.random()*51)*2;

      System.out.print(" " + numeroAleatorio);
      contador ++;
  }
  System.out.println();
  System.out.println ("Los números generados son: " + contador);
  }
}
