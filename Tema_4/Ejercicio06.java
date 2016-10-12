/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
 * Aplica la fórmula t = √ 2h/ g siendo g = 9.81m/s
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio06 {
 
 final static double g = 9.81;
 
 public static void main(String[] args) {
    
    System.out.println("Digame la altura (en metros) desde la que será lanzado el objeto, ");
    
    System.out.print("y yo le calcularé el tiempo de caida: ");
    
    double h = Double.parseDouble(System.console().readLine());
    
    double formula = Math.sqrt (2*h / g);
    
    System.out.printf("El tiempo que tardará en caer su objeto será de: %.2f segundos \n", formula);
  }
}
