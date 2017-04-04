/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Jesús Martín Castro
 */
public class ejercicio05{
  public static void main (String[] arg){
     
     
     System.out.println("Esto es un conversor de Pesetas (pts.) a Euros (€)");
     
     int y = 100;
     double x = 166.386;
     double h = y / x;
     
     System.out.print("\nLa cantidad de " + y + " Pesetas (pts) en Euros ");
     System.out.printf("son: %.2f Euros", h);
   }
}
