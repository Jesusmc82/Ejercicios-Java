/**
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible (precio sin IVA). La base imponible estará almacenada en una
* variable.
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 { 
    public static void main(String[] args) {
      
       double baseImponible = 180;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
    }
}
