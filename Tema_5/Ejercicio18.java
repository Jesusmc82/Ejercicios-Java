/**
* Escribe un programa que obtenga los números enteros comprendidos entre
* dos números introducidos por teclado y validados como distintos, el programa
* debe empezar por el menor de los enteros introducidos e ir incrementando de
* 7 en 7.
*
* @author Jesus Martin Castro
*/
public class Ejercicio18{
  public static void main(String[] args) {
    
    System.out.print("Diga dos números enteros y positivos, le iré sumando de 7 en 7 entre ");
    System.out.println("ese rango de dos números.");
    System.out.println("Pulse Intro para continuar.");
    String linea= System.console().readLine();
    
    System.out.print("Escriba ahora el primer número: ");
    int numeroUno= Integer.parseInt(System.console().readLine());
    System.out.print("Escriba ahora el segundo número: ");
    int numeroDos= Integer.parseInt(System.console().readLine());
    System.out.print("El rango entre el " + numeroUno + " y el ");
    System.out.print(numeroDos + " sumado de 7 en 7 es el siguiente = ");
    
    do {
      
      numeroUno = 7 + numeroUno;
      System.out.print(" " + numeroUno);
    
    } while ((7 + numeroUno) <= numeroDos);
  }
}
