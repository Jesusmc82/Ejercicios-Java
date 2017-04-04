/**
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio08{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.print("Dígame el número de horas trabajadas esta semana");
     System.out.print(" y le diré su sueldo\n");
     System.out.print("(recuerde que cobrará a razón de 12 €/hora)\n");
     System.out.print("¿Cuántas horas tiene trabajadas?: ");
     
     int horas = Integer.parseInt(n.nextLine());
     double sueldo = horas * 12;

     
     System.out.println("\nSu sueldo de esta semana será:");
     System.out.println("   " + horas + " h. x 12 €/h. = " + sueldo + " €");
   }
}
