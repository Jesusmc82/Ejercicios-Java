/**
* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
* de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
* 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. 
*
* @author Jesus Martin Castro
*/
public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Vamos a realizar una quiniela aleatoriamente");
    System.out.println(" con tres apuestas cada partido:");
    String salto = System.console().readLine();
    
    int columnas = 3;
    int casillas = 1;
    
    for (int j = 1; j <= 15; j++) {
      System.out.printf("%2d. ", casillas);
      
      for (int i = 1; i<= columnas; i++) {
        int quiniela = (int)(Math.random()*6);
        
        if (j == 15) {
          columnas = 1;
        }

        switch(quiniela) {
          case 0:
          case 1:
            System.out.print("| X ");
          break;
          case 2:
          case 3:
          case 4:
            System.out.print("|1  ");
          break;
          case 5:
            System.out.print("|  2");
          break;
        default:
        }
        }
      
      System.out.println("|");
      casillas++;
      
    }
  }
}
