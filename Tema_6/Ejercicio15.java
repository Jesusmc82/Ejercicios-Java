/**
* Realiza un generador de melodía con las siguientes condiciones:
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
* sol, la y si.
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
* d) La última nota de la melodía debe coincidir con la primera.
* Ejemplo 1:
*   do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
* Ejemplo 2:
*   la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
*
* @author Jesus Martin Castro
*/
public class Ejercicio15 {
  public static void main(String[] args){
    
    System.out.println("Vamos a crear una melodia, con un compás de compasillo (4/4)");
    System.out.print("Pulse INTRO para generar la melodía:");
    System.console().readLine();
    int compas = (int)(Math.random()* 7) + 1;
    String ultimaNota = "";
    String notaString = "";
    
    for(int j = 0; j <= compas; j++) {
      
      //genera las notas dentro del compás.
      for(int i = 1; i <= 4; i++) {
      
        switch((int)(Math.random()* 7) + 1) {
          case 1:
            notaString = " Do ";
          break;
          case 2:
            notaString = " Re ";
          break;
          case 3:
            notaString = " Mi ";
          break;
          case 4:
            notaString = " Fa ";
          break;
          case 5:
            notaString = " Sol ";
          break;
          case 6:
            notaString = " La ";
          break;
          case 7:
            notaString = " Si ";
          break;
        default:
        }
        
        if ((j == 0) && (i == 1)) {
          ultimaNota = notaString;
        }
        
        if ((j == compas) && (i ==  4)) {
          
          System.out.print(ultimaNota);
        } else {
        System.out.print(notaString);
        }
      }
      
      if (j < compas) {
        System.out.print("|");
      } else if (j == compas) {
        System.out.print("||");
      }
    }
  }
}
