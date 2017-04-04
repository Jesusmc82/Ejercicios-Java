/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @Jesus Martin Castro
 */
public class ejercicio13 {
  public static void main(String[] args) {
  
    int numero;
    int positivo= 0;
    int negativo= 0;
    int control= 0;
    System.out.println("Dígame 10 números distintos y le diré cuántos fueron positivos y cyántos negativos.");

    do{
      numero= Integer.parseInt(System.console().readLine());
      control++;
      
      if(numero>=0){
      positivo++;
      }else{
      negativo++;
      }
    }while (control<=10);
   
    System.out.println("La cantidad de números positivos son: " + positivo);
    System.out.println("La cantidad de números negativos son: " + negativo); 
  }
 }
