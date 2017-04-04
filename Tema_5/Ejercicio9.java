/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *
 *@Jesus Martin Castro
 */
public class Ejercicio9 {
  public static void main(String[] args) {
  
  int numero, numDigito, numeroDivisor;
  System.out.println("Introduzca un número y le diré el número de dígitos que tiene.");
  System.out.println("Inserte ahora su número: ");
  numero = Integer.parseInt(System.console().readLine());
  numDigito=1;
  numeroDivisor = numero;
  
  while (numeroDivisor>10){
    
    numeroDivisor/=10;
      
      numDigito++;
  } 
    System.out.println("Su numero  " + numero + " tiene " +  numDigito + " cifra.");
 }
  
}
