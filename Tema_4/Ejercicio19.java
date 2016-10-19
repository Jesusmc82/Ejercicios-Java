/**
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Jesus Martin Castro
 */
 
public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Dígame un número con máximo 5 dígitos: ");
     
     int numero = Integer.parseInt(System.console().readLine());
     
     
     
     if ((numero > -10) && (numero < 10)) {
        System.out.println("El " + numero + " contiene 1 cifra");
     } else if ((numero <= -10) && (numero >= -99) || (numero >=10) && (numero <=99)) {
        System.out.println("El " + numero + " contiene 2 cifra");
     } else if ((numero <= -100) && (numero >= -999) || (numero >=100) && (numero <=999)) {
        System.out.println("El " + numero + " contiene 3 cifra");
     } else if ((numero <= -1000) && (numero >= -9999) || (numero >=1000) && (numero <=9999)) {
        System.out.println("El " + numero + " contiene 4 cifra");
     } else if ((numero <= -10000) && (numero >= -99999) || (numero >=10000) && (numero <=99999)) {
        System.out.println("El " + numero + " contiene 5 cifra");
     } else {
        System.out.println("Ese número no está admitido en el solicitado");
     }
  }
}
