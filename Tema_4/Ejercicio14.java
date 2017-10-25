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
      
      if ((numero%2 == 0) && (numero % 5 == 0)) {
    System.out.println("El numero introducido es par y divisible entre 5");
    } else if (numero%2 == 0) {
      System.out.println("El numero introducido es par");
    }else if (numero % 5 == 0) {
      System.out.println("El numero introducido es divisible entre 5");
      } else {
      System.out.println("El número introducido no es par, ni divisible entre 5");
    }     
  }
}
