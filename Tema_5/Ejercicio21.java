/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @Jesus Martin Castro
 */
  public class Ejercicio21 {
  public static void main(String[] args) {
  
    int numero;
    double resultado;
    int contadorImpar= 0;
    int par=0;
    double sumaImpar=0;
    int contadorTotal=0;
    
    System.out.println("Introduzca los números enteros que desee para calcular su media.");
    System.out.println("Para terminar meta un número negativo: ");
      
      do{
       
       numero= Integer.parseInt(System.console().readLine());
        
        if(numero>=0){
          contadorTotal++;
        }
        if (numero%2==1){
         sumaImpar= sumaImpar + numero;
         contadorImpar++;
        }else if (numero>par){
          par=numero;
        }
      
      }while (numero>=0);
    
    resultado= sumaImpar/contadorImpar;
      
      System.out.println("El total de números introducidos es: " + contadorTotal);
      System.out.println("El mayor de los pares es: " + par);
      System.out.println("La suma de los números impares es: " + sumaImpar);
      System.out.println("La cantidad de números impares es: " + contadorImpar);
      System.out.println("La suma de los impares " + sumaImpar + "/" + contadorImpar + " el resultado total es: " + resultado);
  }
 }
