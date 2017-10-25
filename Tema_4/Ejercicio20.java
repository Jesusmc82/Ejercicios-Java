/**
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
* puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio20{
  public static void main(String[] args) {

    System.out.print("¿Quiere saber si su número es capicúo? escriba un número de hasta 5 cifras y yo se lo diré: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    if (numeroIntroducido<=9) { //comprobacion para averiguar si el número es capicuo con una cifra
      System.out.print("El número es capicuo");
    }  
    
    if ((numeroIntroducido>= 10) && (numeroIntroducido <= 99)) { //comprobacion para averiguar si el número es capicuo con dos cifras
        if ((numeroIntroducido / 10) == (numeroIntroducido % 10)) {
          System.out.print("El número " + numeroIntroducido + " es capicuo");
        } else {
          System.out.print("El número " + numeroIntroducido + " no es capicuo");
        }
    }
    
    if ((numeroIntroducido>= 100) && (numeroIntroducido <= 999)) { //comprobacion para averiguar si el número es capicuo con tres cifras
        if ((numeroIntroducido / 100) == (numeroIntroducido % 10)) {
          System.out.print("El número " + numeroIntroducido + " es capicuo");
        } else {
          System.out.print("El número " + numeroIntroducido + " no es capicuo");
        }
    }
    
    if ((numeroIntroducido>= 1000) && (numeroIntroducido <= 9999)) { //comprobacion para averiguar si el número es capicuo con cuatro cifras
        if ((numeroIntroducido / 1000) == (numeroIntroducido % 10)) {
          System.out.print("El número " + numeroIntroducido + " es capicuo");
        } else {
          System.out.print("El número " + numeroIntroducido + " no es capicuo");
        }
    }
    
    if ((numeroIntroducido>= 10000) && (numeroIntroducido <= 99999)) { //comprobacion para averiguar si el número es capicuo con cinco cifras
        if (((numeroIntroducido / 10000) == (numeroIntroducido % 10)) && (((numeroIntroducido /1000)%10) == ((numeroIntroducido /10)%10))) {
          System.out.print("El número " + numeroIntroducido + " es capicuo");
        } else {
          System.out.print("El número " + numeroIntroducido + " no es capicuo");
        }
    }
  }
} 
