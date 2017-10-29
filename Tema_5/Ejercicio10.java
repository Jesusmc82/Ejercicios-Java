/**
* Escribe un programa que calcule la media de un conjunto de números positivos
* introducidos por teclado. A priori, el programa no sabe cuántos números se
* introducirán. El usuario indicará que ha terminado de introducir los datos
* cuando meta un número negativo.
*
* @author Jesus Martin Castro
*/
public class Ejercicio10{
  public static void main(String[] args) {
    
    System.out.println("Meta varios números y le daré la suma y la media de todos ellos.");
    System.out.print("Introduzca todos los números que desee, para acabar introduzca un número negativo.");
      String linea = System.console().readLine();
        
      int suma = 0;
      int contador = 0;
      int numeroIntroducido;
        
        do {
          
          System.out.print("Meta un número: ");
            numeroIntroducido= Integer.parseInt(System.console().readLine()); 
          
              if (numeroIntroducido>=0) {
                suma = suma + numeroIntroducido;
                contador ++;
              } else {
              }
          
        } while (numeroIntroducido >= 0);

      int media = suma / contador;
    System.out.println("La suma de sus números introducidos es: " + suma);
    System.out.println("La media de " + suma + " / " + contador + " = " + media);
  }
}
