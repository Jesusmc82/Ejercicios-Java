/**
* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
* Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
* serán de 4 unidades. No hay que comprobar que los datos se introducen
* correctamente; podemos suponer que el usuario los introduce bien. Dentro
* de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
* situado en cualquiera de las posiciones que quedan en el hueco que forma el
* rectángulo.
* Ejemplo:
* Por favor, introduzca la altura de la pecera (como mínimo 4): 4
* Ahora introduzca la anchura (como mínimo 4): 7
*  * * * * * * *
*  *           *
*  *       &   *
*  * * * * * * *  
*
* @author Jesus Martin Castro
*/
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args){
    
    System.out.print("Introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    int altura = 0;
    int espacio = anchura-2;
    int contadorEspacio = 1;
    int pez = (int)(Math.random()* (anchura - 2) * (alturaIntroducida - 2)) + 1;
    
    for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
    }
    
    System.out.println(" ");
    altura++;
    
    do {
      
      System.out.print("*");
      
      for (int i = 1; i <= pez; i++) {
        
      }
      
      for (int i = 1; i <= espacio; i++) {
        
        if (contadorEspacio==pez){
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        contadorEspacio++;
        
      }
      
      System.out.print("*");
      
      System.out.println();
     
     altura++;
  
    }while (altura <= alturaIntroducida-2);
    
    for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
    }
  }
}
