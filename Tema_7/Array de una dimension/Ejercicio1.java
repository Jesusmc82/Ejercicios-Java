/**
* Define un array de 12 números enteros con nombre num y asigna los valores
* según la tabla que se muestra a continuación. Muestra el contenido de todos
* los elementos del array. ¿Qué sucede con los valores de los elementos que no
* han sido inicializados?
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 {
  public static void main(String[] args){
    
    int[] num = new int[12]; // se reserva espacio para 12 enteros
    num[0] = 32;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.println("los valores de los arrays son los siguientes: ");
    for (int i = 0; i < 12; i++) {
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.print("Los valores no inicializados aparecen en 0" );
  }
}
