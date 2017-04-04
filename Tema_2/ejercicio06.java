/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio06{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calculemos el resultado final de una factura");
     
     double baseImponible = 66;
     double ivaSuperreducido = baseImponible * 4 / 100;
     double ivaReducido = baseImponible * 10 / 100;
     double ivaGeneral = baseImponible * 21 / 100;
     
     System.out.printf("\nEl total de su factura con un Iva Superreducido es:");
     System.out.printf("\nBase Imponible: %8.2f", baseImponible);
     System.out.printf("\nIva 4%%:  %15.2f", ivaSuperreducido);
     System.out.printf("\nTotal: %17.2f", (baseImponible + ivaSuperreducido));
     System.out.printf("\n");
     
     System.out.printf("\nEl total de su factura con un Iva Reducido es:");
     System.out.printf("\nBase Imponible: %8.2f", baseImponible);
     System.out.printf("\nIva 10%%:  %14.2f", ivaReducido);
     System.out.printf("\nTotal: %17.2f", (baseImponible + ivaReducido));
     System.out.printf("\n");
     
     System.out.printf("\nEl total de su factura con un Iva General es:");
     System.out.printf("\nBase Imponible: %8.2f", baseImponible);
     System.out.printf("\nIva 21%%: %15.2f", ivaGeneral);
     System.out.printf("\nTotal: %17.2f", (baseImponible + ivaGeneral));
   }
}
