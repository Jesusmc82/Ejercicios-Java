/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio03{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Esto es un conversor de Pesetas (pts.) a Euros (€) ");
     System.out.println("Introduzca la cantidad de Pesetas que desea convertir: ");
     
     int y = Integer.parseInt(n.nextLine());
     double x = 166.386;
     double h = y / x;
     
     System.out.print("La cantidad de " + y + " Pesetas (pts) en Euros que desea ");
     System.out.printf("saber son: %.2f Euros", h);
   }
}
