/**
 *Realiza un conversor de Mb a Kb. 
 * 
 * @author Jesús Martín Castro
 */

import java.util.Scanner;
public class ejercicio10{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Quiere saber cuántos KB son unos MB");
     System.out.print("\n¿Cuántos MB quiere convertir a KB?: ");
      int mb = Integer.parseInt(n.nextLine());
      
      int kb = mb*1024;
     
     
        System.out.println("\nLos " + mb + " MB son " + kb + " KB\n");
        System.out.println(" " + mb + " MB x 1024 = " + kb + "KB");
  }
}
