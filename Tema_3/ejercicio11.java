/**
 *Realiza un conversor de Kb a Mb. 
 * 
 * @author Jesús Martín Castro
 */

import java.util.Scanner;
public class ejercicio11{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Quiere saber cuántos MB son unos KB");
     System.out.print("\n¿Cuántos KB quiere convertir a MB?: ");
      int kb = Integer.parseInt(n.nextLine());
      
      int mb = kb/1024;
     
     
        System.out.println("\nLos " + kb + " KB son " + mb + " MB\n");
        System.out.println(" " + kb + " KB / 1024 = " + mb + "MB");
  }
}
