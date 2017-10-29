/**
* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
* los 5 primeros números enteros a partir de uno que se introduce por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio11{
  public static void main(String[] args) {
    
    System.out.print("Escriba un número y le calcularé el cuadrado y el cubo de ");
    System.out.print(" ese número y sus 5 consiguientes. ");
      int numero = Integer.parseInt(System.console().readLine());
    
      int numeroCuadrado= 0;
      int numeroCubo= 0;
      int control = 0;
    
    System.out.printf("%-10s %-15s %-13s", "Numero", "Cubo²", "Cuadrado³\n");
    System.out.println("------------------------------------------------");
    
      do {
        
        numeroCuadrado = numero * numero;
        numeroCubo = numero * numero * numero;
        
        System.out.printf("%3d %10d²= %1d %13d³= %1d\n", numero, numero, numeroCuadrado, numero, numeroCubo);
        System.out.println("-------------------------------------------");
        
        numero ++;
        
        control ++;
        
      } while (control <= 4);    
  }
}
