/**
 *
 * Realiza un programa que diga si un número introducido por teclado
 * es par y/o divisible entre 5.
 *
 * @author Jesus Martin Castro
 */
 public class Ejercicio14 {

   public static void main(String[] args) {
     
     System.out.println("Introduzca un número entero y le diré si es par o impar");
     System.out.print("y divisible entre 5: ");
     int numero = Integer.parseInt(System.console().readLine());
     
     if ((numero % 2) == 0) {
        System.out.println("El número introducido es par.");
      }else{
        System.out.println("El número introducido es impar.");
      }
      
      if ((numero % 5) == 0) {
        System.out.println("Este número es divisible por 5.");
      }else{
        System.out.println("Este número no es divisible por 5.");
      }
  }
}

