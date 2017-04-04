/**
 *
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio07{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calcularé su nota media");
     
     System.out.print("\nDígame la primera nota: ");
      double nota1 = Double.parseDouble(System.console().readLine());
     
     System.out.print("Indique su segunda nota: ");
      double nota2 = Double.parseDouble(System.console().readLine());
     
     System.out.print("Para terminar indique la tercera nota: ");
      double nota3 = Double.parseDouble(System.console().readLine());
     
     if ((nota1 < 0 ) || (nota2 < 0 ) || (nota3 < 0 )){
      System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
    
    } else if (( nota1 > 10 ) || ( nota2 > 10 ) || ( nota3 > 10 )){    
      System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
    
    } else if ((nota1 > 0 ) || (nota2 > 0 ) || (nota3 > 0 )){      
      double notaMedia = (nota1 + nota2 + nota3) / 3;
    
     System.out.printf("\nSu nota media del trimestre será: %1.1f", notaMedia);
   }
  }
}
