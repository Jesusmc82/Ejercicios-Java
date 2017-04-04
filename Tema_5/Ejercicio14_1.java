/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 *
 * @Jesus Martin Castro
 */
 public class Ejercicio14_1 {
  public static void main(String[] args) {
  
  int base;
  int exponente= 0;
  int multiplicacion= 1;
  int contador= 0;
  
  System.out.println("Vamos a calcular una potencia");
  System.out.println("Dígame la base de la potencia: ");
  base= Integer.parseInt(System.console().readLine());
  System.out.println("Ahora diga el exponente de la potencia: ");
  exponente= Integer.parseInt(System.console().readLine());
  
    while (contador<exponente){
      multiplicacion=  multiplicacion*base;
      contador++;
    }
    
    System.out.println("El resultado de la potencia es: " + multiplicacion);
  }
}
