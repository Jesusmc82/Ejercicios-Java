/**
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
* por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio9{
  public static void main(String[] args) {
    System.out.print("Introduzca un número y le diré la cantidad de cifras que tiene.");
      String linea = System.console().readLine();
    
    System.out.print("Introduzcalo ahora: ");
      int numeroIntroducido= Integer.parseInt(System.console().readLine());
    
      int contador = 0;

        do {
          
          numeroIntroducido = numeroIntroducido/10;
          
          contador ++;
          
        } while (numeroIntroducido !=0);

          if (contador == 1) {
            
            System.out.print("Su número contiene " + contador + " cifra.");
        
          }else {
          
            System.out.print("Su número contiene " + contador + " cifras.");
          }
  }
}
