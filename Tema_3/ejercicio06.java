/**
 *Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio06{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calculemos el área del triangulo");
     System.out.print("\n¿Cuál es el tamaño de su base?: ");
      int base = Integer.parseInt(n.nextLine());
     System.out.print("¿Cuál es el tamaño de su altura?: ");
      int altura = Integer.parseInt(n.nextLine());
 
      double area = (double) base * altura / 2;
     
     
        System.out.println("\nEl área de este triangulo es:\n");
        System.out.println("   (" + base + " x " + altura + ") / 2 = "+ area + " cm²");
  }
}
