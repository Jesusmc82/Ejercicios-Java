/**
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
* @author Jesus Martin Castro
*/
public class Ejercicio21{
  public static void main(String[] args) {
    
    System.out.println("Meta varios números y le daré la suma y la media de todos ellos.");
    System.out.print("Introduzca todos los números que desee, para acabar introduzca un número negativo.");
    System.out.print("Pulse intro para continuar.");
    String linea = System.console().readLine();
        
      double suma = 0;
      double contador = 0;
      double numeroIntroducido;
        
        do {
          
          System.out.print("Meta un número: ");
            numeroIntroducido= Integer.parseInt(System.console().readLine()); 
          
              if (numeroIntroducido>=0) {
                suma = suma + numeroIntroducido;
                contador ++;
              } else {
              }
          
        } while (numeroIntroducido >= 0);
        
        if (contador > 0) {
          
          double media = suma / contador;
          System.out.println("La suma de sus números introducidos es: " + suma);
          System.out.println("La media de " + suma + " / " + contador + " = " + media);
        } else {
          System.out.print("No se ha podido calcular la media porque no se ");
          System.out.println("ha introducido ningún número positivo");
        }
  }
}
