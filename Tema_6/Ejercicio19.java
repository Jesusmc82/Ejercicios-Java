/**
* Escribe un programa que muestre 50 números enteros aleatorios comprendi-
* dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
* luego el máximo de los pares el mínimo de los impares y la media de todos los
* números generados.  
*
* @author Jesus Martin Castro
*/
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args){
    
    System.out.println("Voy a generar 50 números aleatorios entre el - 100 y el 200, ");
    System.out.print("le hayaré el mínimo de los impares, el máximo de los pares y su media de todos los números.");
    System.console().readLine();
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    int suma = 0;
    
    for (int i = 0; i <= 49; i++) {
      int numerosGenerados = (int)(Math.random()* 301) + (-100);
    
        if (numerosGenerados % 2 == 0) {
          if (numerosGenerados > numMax) {
            numMax = numerosGenerados;
          }
        } else {
          if (numerosGenerados < numMin) {
            numMin = numerosGenerados;    
          }
        }
        
      suma = suma + numerosGenerados;
      
      System.out.print(" " + numerosGenerados );
    }
    
    System.out.println();
    
    int media = suma / 50;
    
    System.out.println("Este es el mayor de los pares = " + numMax);
    System.out.println("Este es el mínimo de los impares = " + numMin);
    System.out.println("La suma de todos los números es = " + suma + " y su media = " + media);
    
  }
}
