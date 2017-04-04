/**
 *Escribe un programa que calcule el volumen de un cono según la fórmula V =
 *1/3πr²h
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio09{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calculemos el volumen de un cono");
     System.out.print("\n - ¿Cuál es el radio del cono?: ");
      int radio = Integer.parseInt(n.nextLine());
     System.out.print(" - ¿Cuál es la altura del cono?: ");
      int altura = Integer.parseInt(n.nextLine());
 
      double volumen = (Math.PI*radio*radio*altura)*1/3;
     
     
        System.out.println("\nEl volumen del cono es:\n");
        System.out.println("   1/3 x (π x radio² x altura)= volumen cm³");
        System.out.printf("\n   1/3 x (π x %d² x %d)= %.2f cm³" , radio, altura, volumen);
  }
}
