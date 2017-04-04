/*
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 *
 * @Jesus Martin Castro
 */
 public class Ejercicio18 {
  public static void main(String[] args) {
  
    System.out.print("Diga dos números enteros positivos y yo buscaré los distintos");
    System.out.println(" números que se encuentran entre si sumando de 7 en 7");
    System.out.print("Diga ahora el primer número: ");
    int primerNumero= Integer.parseInt(System.console().readLine());
    System.out.print("Ahora puede decir el segundo número: ");
    int segundoNumero= Integer.parseInt(System.console().readLine());
    
    int incrementando= primerNumero;
  
    do{
    
      System.out.println(" " + incrementando);
    
      incrementando=incrementando+7;
      
    }while (incrementando<=segundoNumero);
    
  
  }
}
