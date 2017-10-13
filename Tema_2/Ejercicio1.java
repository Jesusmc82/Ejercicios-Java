/**
* Escribe un programa en el que se declaren las variables enteras x e y . Asignales
* los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
* el valor de cada variable, la suma, la resta, la división y la multiplicación.
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 { // Clase principal
    public static void main(String[] args) {
      int x= 144; //marcamos las variables y le damos valores.
      int y= 999;
      
       System.out.printf("Estos son los resultados de la Suma, resta, multiplicación y división");
       System.out.printf(" de los números 144 y 999\n");
        
        int suma= y + x;//definimos la variable suma para realizar esta operación.
        System.out.printf("La suma de los números 999 y 144 es:\n");
        System.out.println(" " + y + " +" + " " + x + " = " + suma + " ");
        
        int resta= y - x;//definimos la variable resta para realizar esta operación.
        System.out.printf("La resta de los números 999 y 144 es:\n");
        System.out.println(" " + y + " -" + " " + x + " = " + resta + " ");
        
        int multiplicacion= x * y;//definimos la variable multiplicación para realizar esta operación.
        System.out.printf("La multiplicación de los números 999 y 144 es:\n");
        System.out.println(" " + x + " x" + " " + y + " = " + multiplicacion + " ");
        
        int division= y / x;//definimos la variable división para realizar esta operación.
        System.out.printf("La multiplicación de los números 999 y 144 es:\n");
        System.out.println(" " + y + " /" + " " + x + " = " + division + " ");
    }
}
