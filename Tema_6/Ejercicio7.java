/**
*Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
* nas para los 14 partidos y el pleno al quince (15 filas). 
*
* @author Jesus Martin Castro
*/
public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Vamos a realizar una quiniela aleatoriamente");
    System.out.println(" con tres apuestas cada partido:");
    String salto = System.console().readLine();
    
    int columnas = 3;
    int casillas = 1;
    
    for (int j = 1; j <= 14; j++) {
      System.out.printf("%2d. ", casillas);
      
      for (int i = 1; i<= columnas; i++) {
        int quiniela = (int)(Math.random()*3);
        switch(quiniela) {
          case 0:
            System.out.print("| X ");
          break;
          case 1:
            System.out.print("|1  ");
          break;
          case 2:
            System.out.print("|  2");
          break;
        default:
        }
      }
      
      System.out.println("|");
      casillas++;
    }
    System.out.println();
    System.out.print("15. ");
    int quiniela = (int)(Math.random()*3);
    switch(quiniela) {
      case 0:
        System.out.print("| X ");
      break;
      case 1:
        System.out.print("|1  ");
      break;
      case 2:
        System.out.print("|  2");
      break;
    default:
    }
    System.out.println("|");
  }
}
