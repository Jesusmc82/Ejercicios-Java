/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
* convertir debe ser introducida por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio2 {
    public static void main(String[] args) {
      
      
      System.out.println("Diga los Euros que necesita saber lo que son en pesetas: ");
        double euro = Double.parseDouble(System.console().readLine()); //aquí creamos la variable para la introducción del primer número que el usuario a introducido por teclado
        
        int total = (int) (euro * 166.386); //con esta variable hacemos el cálculo para pasar de Euros a Pesetas la cantidad deseada.
        
        System.out.println(euro + " Euros son:  " + total + " pesetas"); //mostramos el resultado de la conversion
        
    }
}