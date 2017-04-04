/**
 *Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio05{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calculemos el área del rectángulo");
     System.out.print("\n¿Cuál es el tamaño de su base?: ");
      int base = Integer.parseInt(n.nextLine());
     System.out.print("¿Cuál es el tamaño de su altura?: ");
      int altura = Integer.parseInt(n.nextLine());
 
      int area = base * altura;
     
     
        System.out.println("\nEl área de este rectangulo es:\n");
        System.out.println("    " + base + " x " + altura + " = "+ area + " cm²");
  }
}
