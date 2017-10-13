/**
* Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
* convertir deberá estar almacenada en una variable.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 { 
    public static void main(String[] args) {
      
      int peseta= 500; //marco la variable con int para un número entero.
      double euro= 166.386; // se marca la variable con double para poder usar decimales.
      double resultado= peseta/euro; //queremos obetener un resultado con decimales.
      
       System.out.printf("El resultado de " + peseta + " /" + " " + euro + " = %.2f ", resultado); // aquí mostramos el resultado completo, le damos formato de %.2f para obtener dos decimales 
    }
}
