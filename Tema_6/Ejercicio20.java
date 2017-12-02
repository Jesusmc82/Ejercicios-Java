/**
* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*
* *    *
* *====*
* *====*
* ******
* La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua. 
*
* @author Jesus Martin Castro
*/
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args){
    
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    int altura = 1;
    int agua = (int)(Math.random()* alturaIntroducida);
    int sinAgua = alturaIntroducida - agua;
    
    do {
      
      if (agua == 0) {
        System.out.println("*    *");
      } else {
        for (int i = 1; i <= sinAgua; i++) {
          System.out.println("*    *");
          altura ++;
        }
        
        for (int j = 1; j <= agua; j++) {
          System.out.println("*====*");
          altura ++;
        }
      }
      altura ++;
    }while (altura <= alturaIntroducida);
    
    System.out.print("******");
    
    System.out.println();
    System.out.print("La cuba tiene una capacidad de " + alturaIntroducida + " litros y contiene " + agua + " litros de agua.");
  }
}
