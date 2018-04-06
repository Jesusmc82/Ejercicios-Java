/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 *
 * @author Jesus Martin Castro
*/
public class Ejercicio1 {
  public static void main(String[] args){
    
    int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

      num[0][0] = 0;
      num[0][1] = 30;
      num[0][2] = 2;
      num[0][3] = ;
      num[0][4] = ;
      num[0][5] = 5;
      num[1][0] = 67;
      num[1][1] = 33;
      num[2][1] = 7;

      int fila;
      int columna;
      
      for(fila = 0; fila < 3; fila++) {

        System.out.print("Fila: " + fila);
    
        for(columna = 0; columna < 6; columna++) {
          System.out.printf("%10d ", num[fila][columna]);
        }
        System.out.println();    
      }
  
  }
}
