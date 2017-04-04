/**
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Jesús Martín Castro
 */

public class ejercicio01{
  public static void main (String[] arg){
  
     System.out.println("Vamos a ver las distintas operaciones con los número 144 y 999");
     double x, y, h, i, j, k;
        
     x = 144;
    
     y = 999;
    
     h = x + y;
     
     i = y - x;
     
     j = x * y;
     
     k = x / y;
    
     System.out.printf("\nel resultado de la suma es:                   %8.0f", h);

     System.out.printf("\nel resultado de la resta es:                  %8.0f", i);
    
     System.out.printf("\nel resultado de la multiplicación es:         %8.0f", j);
    
     System.out.printf("\nel resultado de la división es:                 %6.2f", k);
     
  }
}
