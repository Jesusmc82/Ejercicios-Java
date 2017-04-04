/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio04{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.print("Dígame el número de horas trabajadas esta semana");
     System.out.print(" y le diré su sueldo\n");
     System.out.print("(recuerde que cobrará a razón de 12 €/hora las 12 primeras horas ");
     System.out.print("y a 16 €/hora las restantes)\n");
     System.out.print("¿Cuántas horas tiene trabajadas?: ");
     
     int horas = Integer.parseInt(n.nextLine());
    
     
     if((horas>=1)&&(horas<=40)){
     double sueldo = horas * 12;
     System.out.println("\nSu sueldo de esta semana será:");
     System.out.println("   " + horas + " h. x 12 €/h. = " + sueldo + " €");
    
    }else if (horas>=41){
     double sueldo = (horas - 40) * 16 + 480;
     System.out.println("\nSu sueldo de esta semana será:");
     System.out.println("(" + horas + " h. - 40 h.) x 16 €/h. + 480 € = " + sueldo + " €");
    }
   }
}
