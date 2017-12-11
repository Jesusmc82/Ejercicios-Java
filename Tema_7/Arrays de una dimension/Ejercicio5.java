/**
* Escribe un programa que pida 10 números por teclado y que luego muestre
* los números introducidos junto con las palabras “máximo” y “mínimo” al lado
* del máximo y del mínimo respectivamente.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 {
  public static void main(String[] args){
    
    System.out.print("Introduzca 10 números y se los mostraré por pantalla (pulse INTRO para continuar): ");
    System.console().readLine();
    
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Inserte número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    
        if (numero[i] < minimo) {
          minimo = numero[i];
        } else if (numero[i] > maximo) {
          maximo = numero[i];
        }
    }
    
    System.out.println("Numero mínimo introducido: " + minimo);
    System.out.println("Numero maximo introducido: " + maximo);
    

  }
}
