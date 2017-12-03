/**
* Escribe un programa que muestre por pantalla 100 números enteros separa-
* dos por un espacio. Los números deben estar generados de forma aleatoria
* en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
* almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*
* @author Jesus Martin Castro
*/
public class Ejercicio25 {
  public static void main(String[] args){
    
    System.out.print("Voy a sacar 100 números al azar los números multiplos de 5");
    System.out.print(" los sacaré entre [] y los primos entre #: ");
    System.console().readLine();

    int numeroAleatorio = 0;
    boolean esPrimo = true;
    
    for (int i = 1; i <= 100; i++) {

      numeroAleatorio = (int)(Math.random()* 191) + 10;
      
      esPrimo= true;
      
      for (int division = 2; division < numeroAleatorio; division ++) { 
        if (numeroAleatorio % division == 0) {
        esPrimo = false;
        }
      }
      
      if (numeroAleatorio % 5 == 0) {
        System.out.print(" [" + numeroAleatorio + "] ");
      } else if(esPrimo) {
        System.out.print(" #" + numeroAleatorio + "# ");
      } else {
        System.out.print(" " + numeroAleatorio);
      }
    }
  }
}
