/**
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
* de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* 
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) { 
    
    System.out.println("Le mostraré una carta de la baraja española al azar: ");
    System.out.print("(Pulse Intro para continuar)");
    String tirada = System.console().readLine();
    
    int suma = 0;

      
      int carta = (int)(Math.random()*10) + 1;
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
        cartaSacada = String.valueOf("10 de");
        break;
        case 8:
        cartaSacada = "Sota de";
        break;
        case 9:
        cartaSacada = "Caballo de";
        break;
        case 10:
        cartaSacada = "Rey de";
        break;
      default:
      }
      
      int palo = (int)(Math.random()*4) + 1;
      
      switch (palo) {
        case 1:
        cartaSacada += " Copas";
        break;
        case 2:
        cartaSacada += " Oros";
        break;
        case 3:
        cartaSacada += " Bastos";
        break;
        case 4:
        cartaSacada += " Espadas";
        break;
      default:
      }

    System.out.println(cartaSacada);
  }
}
