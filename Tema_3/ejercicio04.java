/**
 *Escribe un programa que sume, reste, multiplique y divida dos números
 *introducidos por teclado.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio04{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Diga dos números y yo le daré el resultado de su");
     System.out.print("Suma, Resta, Multiplicación y Division");
     System.out.print("\nDiga el primer número: ");
     int numeroPrimero = Integer.parseInt(n.nextLine());
     System.out.print("Diga el segundo número: ");
     int numeroSegundo = Integer.parseInt(n.nextLine());
 
     int suma = numeroPrimero + numeroSegundo;
     
     int resta = numeroPrimero - numeroSegundo;
     
     int multiPlicacion = numeroPrimero * numeroSegundo;
     
     int division = numeroPrimero / numeroSegundo;
     
     System.out.println("\nEl resultado de la suma es:\n");
     System.out.println("    " + numeroPrimero + " + " + numeroSegundo + " = "+ suma);
     
     System.out.println("\nEl resultado de la resta es:\n");
     System.out.println("    " + numeroPrimero + " - " + numeroSegundo + " = "+ resta);
     
     System.out.println("\nEl resultado de la multiplicación es:\n");
     System.out.println("    " + numeroPrimero + " x " + numeroSegundo + " = "+ multiPlicacion);
     
     System.out.println("\nEl resultado de la division es:\n");
     System.out.println("    " + numeroPrimero + " / " + numeroSegundo + " = "+ division);
  }
}
