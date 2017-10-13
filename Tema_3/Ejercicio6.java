/**
* Escribe un programa que calcule el área de un triángulo.
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 {
    public static void main(String[] args) {
      
      
      System.out.println("Quiere saber el resultado del área de su triángulo");
      
      System.out.println("¿Cuál es el tamaño de su base? (por favor introdúzcalo en centímetros): ");
        double base = Double.parseDouble(System.console().readLine()); //Se introduce el tamaño de su base
        
      System.out.println("¿Cuál es el tamaño de su altura?: ");
        double altura = Double.parseDouble(System.console().readLine());//En este momento agregamos el tamaño de su altura
        
        double area = (base * altura) / 2;//variable donde calculamos el área del triangulo
        
        System.out.printf("El área de su rectángulo es:\n");
        System.out.printf(" " + base + " x " + altura + " /2 = " + area + " cm²");//aquí presentamos el resultado del área.
    }
}
