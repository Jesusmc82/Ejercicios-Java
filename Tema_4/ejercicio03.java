/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 *
 * @author Jesus Martin Castro
 */
import java.util.Scanner;
public class ejercicio03 {
  public static void main(String[] args) {   
       
    System.out.print("¿Qué día de la semana es?: ");
    
    Scanner n =new Scanner(System.in);
    String dia = n.nextLine().toLowerCase();
    
    String semana;
    
    switch (dia) {
      case "1":
        semana = "Lunes";
        break;
      case "2":
        semana = "Martes";
        break;
      case "3":
        semana = "Miércoles";
        break;
      case "4":
        semana = "Jueves";
        break;
      case "5":
        semana = "Viernes";
        break;
      case "6":
        semana = "Sábado";
        break;
      case "7":
        semana = "Domingo";
        break;
      default:
        semana = "no existe";
    }

    System.out.println("El día " + dia + " corresponde al: " + semana);
  }
}
