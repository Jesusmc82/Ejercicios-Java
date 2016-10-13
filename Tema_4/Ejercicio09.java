/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0).
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio09 {
 
 public static void main(String[] args) {
    String linea;
    System.out.println("Resolvamos su ecuación de segundo grado");
    System.out.print("Teclee su primer digito: ");
    linea = System.console().readLine();
    double a;
    a = Double.parseDouble ( linea );
    System.out.print("Teclee su segundo digito: ");
    linea = System.console().readLine();
    double b;
    b = Double.parseDouble ( linea );
    System.out.print("Teclee su tercer digito: ");
    linea = System.console().readLine();
    double c;
    c = Double.parseDouble ( linea );
        
    double x1 = (-b) + Math.sqrt((b*b) -4 * a * c) / (2 * a);
    double x2 = (-b) - Math.sqrt((b*b) -4 * a * c) / (2 * a);
  
    if ((a == 0) && (b == 0) && (c == 0)){
    System.out.println("La ecuación tiene infinitos resultados");
     }
    if ((a > 0) && (b > 0) && (c == 0)){
    System.out.println("No hay solucion para esta ecuacion");
     }
    if ((a > 0) && (b > 0) && (c > 0)){
    System.out.println("No hay solucion para esta ecuacion");
     } 
    if ((a < 0) && (b < 0) && (c < 0)){
    System.out.println("No hay solucion para esta ecuacion");
     }  
  }
}
