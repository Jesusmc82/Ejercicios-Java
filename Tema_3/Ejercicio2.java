/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
* convertir debe ser introducida por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio2 {
    public static void main(String[] args) {
      
      System.out.print("Diga los Euros que necesita saber lo que son en pesetas: ");
        double euro = Double.parseDouble(System.console().readLine()); //aquí creamos la variable para la introducción del primer número que el usuario a introducido por teclado
        
        System.out.println(euro + " Euros son:  " + (int) (euro * 166.386) + " pesetas"); //mostramos el resultado de la conversion con la formula directamente y convirtiendo la variable a un número entero, sin decimales.
        
    }
}
