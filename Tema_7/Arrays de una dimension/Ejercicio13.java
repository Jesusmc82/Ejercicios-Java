/**
* Escribe un programa que rellene un array de 100 elementos con números ente-
* ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
* el programa mostrará el array y preguntará si el usuario quiere destacar el
* máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
* el número destacado entre dobles asteriscos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio13 {
  public static void main(String[] args){
    
    int[] numero = new int[100];
    int numMax = Integer.MIN_VALUE; 
    int numMin = Integer.MAX_VALUE;
    int numeroDestacar;
    int i;
    String rojo = "\033[31m";
    String blanco = "\033[39m";
    
    for (i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()* 501);
      System.out.print(numero[i] + " ");
      
      if (numero[i] > numMax) {
        numMax = numero[i];
      } 
      
      if (numero[i] < numMin) {
        numMin = numero[i];
      }
    }
    
    System.out.println();
    System.out.println(" " + numMin);
    System.out.println(" " + numMax);
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    numeroDestacar = Integer.parseInt(System.console().readLine());
    
    if (numeroDestacar == 1) {
      for (i = 0; i < 100; i++) {
        if (numero[i] == numMin) {
          System.out.print(rojo + " **" + numMin + "**");
        } else {
          System.out.print(blanco + " " + numero[i]);
        }
      }
    }
    
    if (numeroDestacar == 2) {
      for (i = 0; i < 100; i++) {
        if (numero[i] == numMax) {
          System.out.print(rojo + " **" + numMax + "**");
        } else {
          System.out.print(blanco + " " + numero[i]);
        }
      }
    }
  }
}
