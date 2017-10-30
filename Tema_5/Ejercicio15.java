/**
* Escribe un programa que dados dos números, uno real (base) y un entero
* positivo (exponente), saque por pantalla todas las potencias con base el
* numero dado y exponentes entre uno y el exponente introducido. No se deben
* utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
* se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
*
* @author Jesus Martin Castro
*/
public class Ejercicio15{
  public static void main(String[] args) {
    
    System.out.println("Dígame una base y su exponente para calcular una potencia");
    System.out.print("Diga su base: ");
      int base = Integer.parseInt(System.console().readLine());
    System.out.print("Diga su exponente: ");
      int exponente = Integer.parseInt(System.console().readLine());
      
    System.out.print("\n");  
    System.out.println("Le voy a calcular la siguiente potencia " + base + "^" + exponente);
    
    int potencia = 1;
    int control = 0;
    int resultado= 0;
    
    if (exponente==0) {
    
      System.out.println(" ");
    
    } else {
      
      do {
          
          resultado = potencia * base;
          
          potencia = resultado;
          
          control ++;
      
      } while (control <= exponente - 1);
    }
    
    System.out.println("El resultado de su potencia " + base + "^" + exponente + " es: " + resultado);
  }
}