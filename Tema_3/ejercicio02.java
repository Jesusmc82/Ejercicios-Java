/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio02{
  public static void main (String[] arg){
    
     Scanner n = new Scanner(System.in);
     
     System.out.println("Esto es un conversor de Euros (€) a Pesetas (pts.)");
     System.out.print("Introduzca la cantidad de Euros que desea convertir: ");
     
     double y = Double.parseDouble(n.nextLine());
     double x = 166.386;
     double h = (int)(y * x);
     
     System.out.print("La cantidad de " + y + " Euros(€) en pesetas que desea ");
     System.out.print("saber son: " + h + " Pesetas");
   }
}
