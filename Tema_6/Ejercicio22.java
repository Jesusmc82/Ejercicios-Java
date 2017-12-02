/**
* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
* aleatorio. La cabeza se representará con el carácter @ y se debe colocar
* exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
* el cuerpo irá serpenteando de la siguiente manera: se generará de forma
* aleatoria un valor entre tres posibles que hará que el siguiente carácter se
* coloque una posición a la izquierda del anterior, alineado con el anterior o una
* posición a la derecha del anterior. La longitud de la serpiente se pedirá por
* teclado y se supone que el usuario introducirá un dato correcto.
* Ejemplo:
* Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
* 
*     @
*     *
*    *
*     *
*    *
*    *
*     *
*
* @author Jesus Martin Castro
*/
public class Ejercicio22 {
  public static void main(String[] args){
    
    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());

    int espacio = 12;
    int espacioDos= 0;
    
    for(int i = 1; i <= espacio; i++) { 
      System.out.print(" ");
    }
      System.out.println("@");
        
    for (int j = 1; j <= longitud; j++) {
        
      espacioDos= (int)(Math.random()* (4-1)) + 11;
        
      for(int i = 1; i <= espacioDos; i++) { 
        System.out.print(" ");
      }
      System.out.println("*");
    }  
  }
}
