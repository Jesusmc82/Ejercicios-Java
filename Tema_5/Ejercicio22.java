/**
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio22{
  public static void main(String[] args) {
    
    System.out.println("Le mostraré los números primos desde el 2 hasta el 100");
    for (int numero = 2; numero <= 100; numero++) {
     
    int division = 2;
    int resultado = 0;
    boolean esPrimo = true;
    
    do {
      
      resultado = numero % division;
      if (resultado == 0) {
        esPrimo= false;
      }
       
      division ++;
      
    } while (division < numero);
    
     if (numero == 2) {
      System.out.print(" " + numero);
    } else if (esPrimo) {
      System.out.print(" " + numero);
    }    
    }
  }
}
