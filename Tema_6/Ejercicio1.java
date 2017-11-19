/**
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total (los puntos que suman entre los tres dados).
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) { 
    System.out.print("Vamos a mostrarle la tirada de 3 dados y la suma de total de todos: ");
    String tirada = System.console().readLine();
    
    for (int i = 1; i <= 6; i++) {
System.out.println((int)(Math.random()*7 + 1) + " ");
    }
    
  }
}
