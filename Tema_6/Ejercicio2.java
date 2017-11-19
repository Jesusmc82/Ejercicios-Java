/**
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total (los puntos que suman entre los tres dados).
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) { 
    
    System.out.println("Vamos a mostrarle la tirada de 3 dados y la suma de total de todos: ");
    System.out.print("(Pulse Intro para continuar)");
    String tirada = System.console().readLine();
    
    int suma = 0;

    for (int i = 0; i < 3; i++) {
      
      int dado = (int)(Math.random()*7) + 1;
      
      switch (dado) {
        case 1:
        System.out.print(" ⚀ = 1 ");
        suma+=1;
        break;
        case 2:
        System.out.print(" ⚁ = 2 ");
        suma+=2;
        break;
        case 3:
        System.out.print(" ⚂ = 3 ");
        suma+=3;
        break;
        case 4:
        System.out.print(" ⚃ = 4 ");
        suma+=4;
        break;
        case 5:
        System.out.print(" ⚄ = 5 ");
        suma+=5;
        break;
        case 6:
        System.out.print(" ⚅ = 6 ");
        suma+=6;
        break;
      default:
      }
    }
    System.out.println();
    System.out.println("Total suma tres dados : " + suma);
  }
}
