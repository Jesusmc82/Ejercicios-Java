/*
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @Jesus Martin Castro
 */
 public class Ejercicio16 {
  public static void main(String[] args) {

  System.out.println("Diga un número y le diré si es primo o no: ");
  int numero= Integer.parseInt(System.console().readLine());
  
   boolean primo= true;
     
  if (numero<= 0){
    System.out.println("Su número no es primo");
  }else{
  
    for (int modulo= 2; modulo < numero; modulo++) {
              
       if ((numero % modulo) == 0) {
          
          primo=false;
        }      
      }      
        if (primo){  
          System.out.println("Su número es primo");
        }else{
          System.out.println("Su número no es primo");
        }
    } 
  }
}
