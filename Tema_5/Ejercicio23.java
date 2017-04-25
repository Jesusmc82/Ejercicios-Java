/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 *
 * @Jesus Martin Castro
 */
public class Ejercicio23 {
 public static void main(String arg[]){
  
    int numero;
    double resultado;
    int contadorNumero= 0;
    int par=0;
    double sumaNumero=0;
    
    System.out.print("Le voy a calcular la suma de varios números introducidos por teclado, ");
    System.out.println("le diré la cantidad de introducidos y la media de estos: ");
      
      do{
       
       numero= Integer.parseInt(System.console().readLine());
        
         sumaNumero= sumaNumero + numero;
         contadorNumero++;
        
      }while (sumaNumero<10000);
    
    resultado= sumaNumero/contadorNumero;
      
      System.out.println("La suma de todos los números introducidos es: " + sumaNumero);
      System.out.println("Se han introducido " + contadorNumero+ " números");
      System.out.println("La media de los números introducidos es " + sumaNumero + "/" + contadorNumero + " : " + resultado);
  }
 }
