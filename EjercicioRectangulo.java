/**
* Piramide rellena
*
* @author Jesus Martin Castro
*/
public class EjercicioRectangulo{
  public static void main(String[] args) {
    System.out.print("Introduzca una altura para su rectangulo o cuadrado ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca una altura para su rectangulo o cuadrado ");
    int baseIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca un caracter con el que quiera dibujar la piramide ");
    String caracter = System.console().readLine();
    
    int altura = 1;
    int numCaracteres = 1;
    System.out.println();
    do {
      
      for (int i = 1; i <= baseIntroducida-1; i++) {
        System.out.print(caracter);
      }
      
      for (int j = 1; j <= numCaracteres; j++) {
        System.out.print(caracter);
      }
      
     
     System.out.println();
     
     altura++;
  
    }while (altura <= alturaIntroducida);
  }
}
