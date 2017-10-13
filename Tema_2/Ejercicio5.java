/**
* Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
* convertir deberá estar almacenada en una variable.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 { 
    public static void main(String[] args) {
      
      double peseta= 166.386; //marco la variable con double dado que son pesetas con número decimal.
      double euro= 3.01;
      double resultado= peseta * euro;
      
       System.out.printf("El resultado de " + peseta + " x" + " " + euro + " = %.0f ", resultado); // aquí mostramos el resultado completo, le damos formato de %.0f para no obtener ningún decimal en el resultado final.
    }
}
