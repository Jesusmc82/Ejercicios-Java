/**
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado. 
*
* @author Jesus Martin Castro
*/
public class Ejercicio10 {
  public static void main(String[] args) {
  
    int linea = 0;
    int fila = 10;
    
    for (int i = 1; i<= fila; i++) {
      linea = (int)(Math.random()*41)+1;
      for (int j = 1; j <= linea; j++) {
        int dibujo = (int)(Math.random()*7);
        switch(dibujo) {
          case 1:
            System.out.print("*");
          break;
          case 2:
            System.out.print("-");
          break;
          case 3:
            System.out.print("=");
          break;
          case 4:
            System.out.print(".");
          break;
          case 5:
            System.out.print("|");
          break;
          case 6:
            System.out.print("@");
          break;
        default:
        }
      }
     System.out.println();
    }
  }
}
