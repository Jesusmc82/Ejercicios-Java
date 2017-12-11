/**
* Escribe un programa que lea 15 números por teclado y que los almacene en un
* array. Rota los elementos de ese array, es decir, el elemento de la posición 0
* debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
* la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
* del array.
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 {
  public static void main(String[] args){
    
    System.out.print("Introduzca 15 números y se los mostraré por pantalla (pulse INTRO para continuar): ");
    System.console().readLine();
    
    int[] numero = new int[15];
    int aux = 0;
    int[] numero2= new int[15];
    System.out.println();
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Inserte número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    
    System.out.print("Introducidos= ");
    for(int i = 0; i < 15; i ++) {
      System.out.print(" "+ numero[i]);
    }
    
    System.out.println();    
    
    System.out.print("Rotados=      ");
    aux = numero[14];
    System.out.print(" " + aux);
    
    for (int j = 0; j < 14; j ++) {
      numero2[j] = numero[j];
      System.out.print(" " + numero2[j]);
    }
  }
}
