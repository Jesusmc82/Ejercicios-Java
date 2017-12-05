/**
* Escribe un programa que lea 10 números por teclado y que luego los muestre
* en orden inverso, es decir, el primero que se introduce es el último en
* mostrarse y viceversa.
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 {
  public static void main(String[] args){
    
    System.out.print("Introduzca 10 números y se los mostraré por pantalla (pulse INTRO para continuar): ");
    
    System.console().readLine();
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Inserte número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.print(" " + num[i]);
    }
  }
}
