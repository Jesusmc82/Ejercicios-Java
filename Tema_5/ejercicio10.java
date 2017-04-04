/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 *@Jesus Martin Castro
 */
public class ejercicio10 {
  public static void main(String[] args) {
  
  int numero, division, sumando, resultado;
  division=0;
  sumando=0;
  do{
    System.out.println("Introduzca los números enteros que desee para calcular su media.");
    System.out.println("Para terminar meta un número negativo: ");
    numero= Integer.parseInt(System.console().readLine());
  
    sumando= numero + sumando;
    division++;
   }while (numero>=0);
  division--;
  sumando=sumando-numero;
  resultado= sumando/division;
    System.out.println(sumando+" "+division+ " ");
    System.out.printf("Su numero %d", resultado);
  }
 }

