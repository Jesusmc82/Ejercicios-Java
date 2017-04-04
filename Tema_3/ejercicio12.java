/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * @author Jesús Martín Castro
 */

import java.util.Scanner;
public class ejercicio12{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.print("Vamos a calcular la nota que precisa en su segundo");
     System.out.println("examen para la nota media que desea sacar en el trimestre");
     
     System.out.print("      - ¿Qué nota sacó en el primer examen?: "); 
      double primerExamen = Double.parseDouble(n.nextLine());
    
     System.out.print("      - ¿Cuál es la nota media que desea sacar en el trimestre?: ");
      double notaMedia = Double.parseDouble(n.nextLine());      
     
      double segundoExamen = (notaMedia-(primerExamen*40/100.0))/(60/100.0);
     
     
        System.out.print("\nSegún los datos proporcionados la nota que ");
        System.out.print("deberá sacar en el segundo examen de programación es: " + segundoExamen);
        System.out.print("\n       ("  + notaMedia + " - ((" + primerExamen + " x 40/100))" + "/(60/100) = " + segundoExamen);
  }
}
