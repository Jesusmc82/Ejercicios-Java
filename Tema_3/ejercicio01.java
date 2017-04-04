/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio01{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Diga dos números y yo le daré el resultado de su multiplicacion");
     System.out.print("\nDiga el primer número: ");
     int numeroPrimero = Integer.parseInt(n.nextLine());
     System.out.print("Diga el segundo número: ");
     int numeroSegundo = Integer.parseInt(n.nextLine());
 
     int resultado = numeroPrimero * numeroSegundo;
     
     System.out.println("\nEl resultado de la multiplicación es:\n");
     System.out.println("    " + numeroPrimero + " x " + numeroSegundo + " = "+ resultado);
  }
}
