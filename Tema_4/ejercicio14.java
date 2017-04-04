/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Jesus Martin Castro
 */
public class ejercicio14 { 
 public static void main(String[] args) {

  String linea;
  System.out.print("Escriba un número entero y le diré si es ");
  System.out.println("par y/o divisible por 5");
    linea = System.console().readLine();
  
  System.out.print("Diga ahora el número (debe ser entero): ");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero % 2) == 0) {
      System.out.println("\nEl número introducido es par");
    }else{
      System.out.println("\nEl número introducido es impar");
    }
    
    if ((numero % 5) == 0) {
      System.out.println("\nEl número introducido es divisible por 5");
    }else{
      System.out.println("\nEl número introducido no es divisible por 5");
    }
 }
}
