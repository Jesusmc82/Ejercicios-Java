/**
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
* “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
* ambos números están entre 0 y 9. El programa deberá colocar el número de
* la posición inicial en la posición final, rotando el resto de números para que no
* se pierda ninguno. Al final se debe mostrar el array resultante.
* Por ejemplo, para inicial = 3 y final = 7:
*
* @author Jesus Martin Castro
*/
public class Ejercicio12 {
  public static void main(String[] args){
    
    int[] numero = new int[10];
    int i;
    int[] resultado = new int [10];
    int nInicial;
    int nFinal;
    
    for (i = 0; i < 10; i++) {
      //System.out.print("Inserte número: ");
      numero[i] = (int)(Math.random()* 100);
      //numero[i] = Integer.parseInt(System.console().readLine());
      System.out.print(numero[i] + " ");
    }
    

    System.out.println("\n\nArray original: ");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("| Indice ");
    for  (int x=0; x<10; x++) {
      System.out.printf("|%4d ", x);
    }

    System.out.println("|\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("| Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%4d ", numero[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
   for (i = 0; i < 10; i++) {
      resultado[i] = numero[i];
      System.out.print(" " + i + " = " + (resultado[i] -1) + " ");
    }
    
    
    
    for (i = nFinal + 1 ; i < 10; i++) {
      resultado[i] = numero[i - 1];
      System.out.print(" " + i + " = " + resultado[i] + " ");
    }*/
    
  }
}
