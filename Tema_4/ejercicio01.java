/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Jesus Martin Castro
 */
import java.util.Scanner;
public class ejercicio01 {
  public static void main(String[] args) {   
       
    System.out.print("¿Qué día quiere saber la asignatura que toca a primera hora?: ");
    
    Scanner n =new Scanner(System.in);
    String dia = n.nextLine().toLowerCase();
    
    String asignatura;
    
    switch (dia) {
      case "lunes":
        asignatura = "Sistemas Informaticos";
        break;
      case "martes":
        asignatura = "Programación";
        break;
      case "miercoles":
        asignatura = "Programación";
        break;
      case "jueves":
        asignatura = "Base de Datos";
        break;
      case "viernes":
        asignatura = "Lenguaje de Marcas";
        break;
      
      default:
        asignatura = "Ese día no hay clases";
    }

    System.out.println("La asignatura para el " + dia + " es: " + asignatura);
  }
}
