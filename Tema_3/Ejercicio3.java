/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
* convertir debe ser introducida por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 {
    public static void main(String[] args) {
      
      
      System.out.println("Diga los Pesetas que necesita saber lo que son en Euros: ");
        int pesetas = Integer.parseInt(System.console().readLine()); //aquí creamos la variable para la introducción del primer número que el usuario a introducido por teclado
        
        double total = (pesetas / 166.386);//con esta variable hacemos el cálculo para pasar de pesetas a Euros la cantidad deseada.
        
        System.out.printf("La cantidad de pesetas %d que desea saber son: %.2f Euro", pesetas, total); //mostramos el resultado de la conversion
        
    }
}
