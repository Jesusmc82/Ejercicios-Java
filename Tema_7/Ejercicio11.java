/**
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
* primos a las primeras posiciones, desplazando el resto de números (los que
*no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
* el array resultante.
*
* @author Jesus Martin Castro
*/
public class Ejercicio11 {
  public static void main(String[] args){
    
    int[] numero = new int[10];
    int[] numeroPrimo = new int[10];
    int[] numeroNoPrimo = new int[10];
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;
    boolean esPrimo = true;
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Inserte número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
      esPrimo = true;
      for (int division = 2; division < numero[i]; division ++) { 
        if (numero[i] % division == 0) {
        esPrimo = false;
        }
      }
      if (esPrimo) {
        numeroPrimo[i] = numero[i];
        contadorPrimo++;
      } else {
        numeroNoPrimo[i] = numero[i];
        contadorNoPrimo++;
      }
    }
    
    for (int n:numeroPrimo) {
      if (n!=0) {
        System.out.print(" " + n);
      }
    }
    
    for (int n:numeroNoPrimo) {
      if (n!= 0) {
        System.out.print(" " + n);
      }
    }
  }
}
