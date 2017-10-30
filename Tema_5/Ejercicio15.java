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
      
    System.out.println();  
      int potencia = 1;
      int control = 1;
      int resultado= 0;
    
    if (exponente==0) {
    
     System.out.println(" " + base + "^" + exponente + " es: 1");
    
    } else {
      
      do {
          
          resultado = potencia * base;
          System.out.println(" " + base + "^" + control + " : " + resultado);  
          potencia = resultado;
          control ++;
        
      } while (control <= exponente);
    }
    
  }
}
