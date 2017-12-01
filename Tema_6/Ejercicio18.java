/**
* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
* sustituir el color blanco por colores más alegres. Realiza un programa que
* genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
* cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
* que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
* violeta y naranja.  
*
* @author Jesus Martin Castro
*/
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args){
    
    System.out.println("Vamos a pintar de forma aleatoria la casa de Sinestesio y Casilda.");
    System.out.print("Pulse INTRO para continuar:");
    System.console().readLine();
    String dormitorioUno = "blanco";
    String dormitorioDos = "blanco";
    String dormitorioTres = "blanco";
    String color = "";
    int contador = 0;
    
     while ((dormitorioUno == dormitorioDos) || (dormitorioDos == dormitorioTres) || (dormitorioUno == dormitorioTres)) {
      
      for(int i = 1; i <= 3; i ++) {
        
        switch((int)(Math.random()* 5) + 1) {
          case 1:
            color = " Rojo ";
            break;
          case 2:
            color = " Azul ";
            break;
          case 3:
            color = " Verde ";
            break;
          case 4:
            color = " Violeta ";
            break;
          case 5:
            color =" Naranja ";
            break;
          default:
        }
      
        if (i == 1) {
          dormitorioUno = color;
        }
        if (i == 2) {
          dormitorioDos = color;
        }
        if (i == 3) {
          dormitorioTres = color;
        }
      }
      
      
      
    }
    
    System.out.println("El color del primer dormitorio será = " + dormitorioUno);
    System.out.println("El color del segundo dormitorio será = " + dormitorioDos);
    System.out.println("El color del tercer dormitorio será = " + dormitorioTres);
  }
}
