/**
* Escribe un programa que diga si un número introducido por teclado es o no
* primo. Un número primo es aquel que sólo es divisible entre él mismo y la
* unidad.
*
* @author Jesus Martin Castro
*/
public class Ejercicio22{
  public static void main(String[] args) {
    
    /*System.out.println("Averigüemos si su número es primo o no.");
    System.out.println("Introduzca ahora su número ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());*/
    int primo = 2;
    int division = 2;
    int resultado = 0;
    boolean esPrimo = false;
    
    do {
      
      
      if ((primo <= 100) && (resultado != 0)) {
        resultado = primo % division;
        esPrimo= true;
        System.out.print(" " + primo);
      }
       
      division ++;
      
    } while (division <= 100);
    
     /*if (numeroIntroducido == 2) {
      System.out.print("Su número " + numeroIntroducido + " es primo");
    } else if (!esPrimo) {
        System.out.print("Su número " + numeroIntroducido + " no es primo");
    } else {
        System.out.print("Su número " + numeroIntroducido + " es primo");
    }*/
    
  }
}
