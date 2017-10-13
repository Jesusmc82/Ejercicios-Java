/**
* Realiza un programa que pida dos números y que luego muestre el resultado
* de su multiplicación.
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 {
    public static void main(String[] args) {
      System.out.println("Diga dos números enteros, y yo le diré el resultado de su multiplicación");
      
      System.out.println("Por favor, diga ahora el primer número: ");
        int numeroUno = Integer.parseInt(System.console().readLine()); //aquí creamos la variable para la introducción del primer número que el usuario a introducido por teclado
      
      System.out.println("Ahora introduzca el segundo número: ");
        int numeroDos = Integer.parseInt(System.console().readLine()); //con esta variable introducimos el segundo número que el usuario a introducido por teclado
        
        int resultado = (numeroUno * numeroDos);//realizamos la multiplicación de las dos variables introducidas por el usuario
        
        System.out.println("El resultado de multiplicar " + numeroUno + " x " + numeroDos + " = " + resultado); //mostramos el resultado de la multiplicación
        
    }
}
