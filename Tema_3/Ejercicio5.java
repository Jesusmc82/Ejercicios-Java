/**
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 {
    public static void main(String[] args) {
      
      
      System.out.println("Dígame el tamaño de su rectángulo y le diré su área");
      
      System.out.println("¿Cuál es el tamaño de su base? (por favor introdúzcalo en centímetros): ");
        double base = Double.parseDouble(System.console().readLine()); //Se introduce el tamaño de su base
        
      System.out.println("¿Cuál es el tamaño de su altura?: ");
        double altura = Double.parseDouble(System.console().readLine());//En este momento agregamos el tamaño de su altura
        
        double area = base * altura;//variable donde calculamos el área del rectángulo
        
        System.out.printf("El área de su rectángulo es:\n");
        System.out.printf(" " + base + " x " + altura + " = " + area + " cm²");//aquí presentamos el resultado del área.
    }
}
