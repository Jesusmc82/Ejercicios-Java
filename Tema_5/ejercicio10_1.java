/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 *@Jesus Martin Castro
 */
public class ejercicio10_1 {
  public static void main(String[] args) {
  
  int numero, sumando, numeroUno, division;
  double resultado;
  division=1;
  System.out.println("Introduzca los números enteros que desee para calcular su media.");
  System.out.println("Para terminar meta un número negativo: ");
    numeroUno= Integer.parseInt(System.console().readLine());
    sumando=numeroUno;
  System.out.println("Inserte todos los número que desee:");  
    do{
      if(division==3){
        System.out.println("Recuerde que con un número negativo deja de insertar números");
      }else if(division==6){
        System.out.println("Le recuerdo que insertando un número negativo terminará el cálculo");
      }else if(division==10){
        System.out.println("Para acabar insertar número negativo");
      }else{
      }
      numero= Integer.parseInt(System.console().readLine());
    
      sumando=  numero + sumando;
      division++;
    }while (numero>=0);
  division--;
  sumando= sumando - numero;
  resultado= sumando/(double)division;
    System.out.println("La suma de todos sus número es " +sumando+ " y el divisor para hayar la media es " + division);
    System.out.println("La media es: " + resultado);
  }
 }
