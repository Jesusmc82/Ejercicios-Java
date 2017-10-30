/**
* Escribe un programa que pida una base y un exponente (entero positivo) y=
* que calcule la potencia.
*
* @author Jesus Martin Castro
*/
public class Ejercicio14{
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
