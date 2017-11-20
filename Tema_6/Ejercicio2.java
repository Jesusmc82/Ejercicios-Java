/**
* Realiza un programa que muestre al azar el nombre de una carta de la
* baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
* diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
* cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
* sería el 1). Para convertir un número en una cadena de caracteres podemos
* usar String.valueOf(n) .
* 
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) { 
    
    System.out.println("Le mostraré una carta de la baraja francesa al azar: ");
    System.out.print("(Pulse Intro para continuar)");
    String tirada = System.console().readLine();
    
    int suma = 0;

      
      int carta = (int)(Math.random()*13) + 1;
      String cartaSacada = "";
      
      switch (carta) {
        case 1:
        cartaSacada = "A de";
        break;
        case 2:
        cartaSacada = String.valueOf("2 de");
        break;
        case 3:
        cartaSacada = String.valueOf("3 de");
        break;
        case 4:
        cartaSacada = String.valueOf("4 de");
        break;
        case 5:
        cartaSacada = String.valueOf("5 de");
        break;
        case 6:
        cartaSacada = String.valueOf("6 de");
        break;
        case 7:
        cartaSacada = String.valueOf("7 de");
        break;
        case 8:
        cartaSacada = String.valueOf("8 de");
        break;
        case 9:
        cartaSacada = String.valueOf("9 de");
        break;
        case 10:
        cartaSacada = String.valueOf("10 de");
        break;
        case 11:
        cartaSacada = "J de";
        break;
        case 12:
        cartaSacada = "Q de";
        break;
        case 13:
        cartaSacada = "K de";
        break;
      default:
      }
      
      int palo = (int)(Math.random()*4) + 1;
      
      switch (palo) {
        case 1:
        cartaSacada += " Picas ";
        break;
        case 2:
        cartaSacada += " Corazones ";
        break;
        case 3:
        cartaSacada += " Diamantes ";
        break;
        case 4:
        cartaSacada += " Tréboles ";
        break;
      default:
      }

    System.out.println(cartaSacada);
  }
}
