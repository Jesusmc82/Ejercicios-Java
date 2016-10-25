/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 *
 * @author Jesus Martin Castro
 */
public class ejercicio05 {
 public static void main(String[] args) {
    System.out.println("Intentemos resolver su ecuación ax+b=0");
    System.out.println("Dígame un primer número: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Dígame un segundo número: ");
    double b = Double.parseDouble(System.console().readLine());
    double formula = - b / a;
    System.out.println("x = " + formula);
  }
}
    
    
    
