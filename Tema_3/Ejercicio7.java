/**
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible.
*
* @author Jesus Martin Castro
*/
public class Ejercicio7 {
    public static void main(String[] args) {
      
      System.out.println("¿La base imponible de su factura es?: ");
        double baseImponible = Double.parseDouble(System.console().readLine()); //Se introduce el tamaño de su base
        
        double ivaGeneral = (baseImponible * 21) / 100; //calculamos el iva general del 21% con esta variable
        double totalGeneral = ivaGeneral + baseImponible; //en esta otra sumamos el iva general del 21% calculado con la base imponible
        double ivaReducidoUno = (baseImponible * 10) / 100;//calculamos el iva reducido del 10% con esta variable
        double totalReducidoUno = ivaReducidoUno + baseImponible;//en esta otra sumamos el iva reducido del 10% calculado con la base imponible
        double ivaReducidoDos = (baseImponible * 4) / 100;//calculamos el iva reducido del 4% con esta variable
        double totalReducidoDos = ivaReducidoDos + baseImponible;//en esta otra sumamos el iva reducido del 4% calculado con la base imponible
        
      System.out.printf("El total de su factura con el tipo general del 21%% es: \n");
      System.out.printf("Base Imponible %8.2f\n", baseImponible);//mostramos la base imponible
      System.out.printf("Iva General 21%% %7.2f\n", ivaGeneral);//mostramos el iva general de la base imponible
      System.out.printf("Total %17.2f\n", totalGeneral);//se muestra el resultado de sumar la base imponible y el iva general
      
      System.out.printf("El total de su factura con el tipo reducido del 10%% es: \n");
      System.out.printf("Base Imponible %8.2f\n", baseImponible);//mostramos la base imponible
      System.out.printf("Iva General 21%% %7.2f\n", ivaReducidoUno);//mostramos el iva reducido del 10% de la base imponible
      System.out.printf("Total %17.2f\n", totalReducidoUno);//se muestra el resultado de sumar la base imponible y el iva reducido del 10%
      
      System.out.printf("El total de su factura con el tipo reducido del 4%% es: \n");
      System.out.printf("Base Imponible %8.2f\n", baseImponible);//mostramos la base imponible
      System.out.printf("Iva General 21%% %7.2f\n", ivaReducidoDos);//mostramos el iva reducido del 4% de la base imponible
      System.out.printf("Total %17.2f", totalReducidoDos);//se muestra el resultado de sumar la base imponible y el iva reducido del 4%
    }
}
