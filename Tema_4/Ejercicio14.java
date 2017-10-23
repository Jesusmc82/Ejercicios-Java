/**
* Realiza un programa que diga si un número introducido por teclado es par y/o
* divisible entre 5.
*
* @author Jesus Martin Castro
*/
public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Comprobemos si un número es par o divisible por 5");
      String linea = System.console().readLine();
    System.out.print("Diga ahora un número al azar: ");
      int numero = Integer.parseInt(System.console().readLine());
      boolean esPar = false;
      boolean esDivCinco = false;
      
      if (numero%2 == 0) {
        esPar = true;
      }
      
      if (numero % 5 == 0) {
        esDivCinco = true;
      }
      
      if (esPar) {
        System.out.println("El número introducido es par");
      }
      
      if (esDivCinco) {
        System.out.println("El número introducido es divisible entre 5");
      }
      
  }
}
