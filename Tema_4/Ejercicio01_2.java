/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio01_2 {
  public static void main(String[] args) {
  
    System.out.println("¿Qué día de la semana desea saber?");
    System.out.print(" Lunes,");
    System.out.print(" Martes,");
    System.out.print(" Miercoles,");
    System.out.print(" Jueves,");
    System.out.println(" Viernes");
    
    String opcion = System.console().readLine().toLowerCase();
    int Lunes;
    int Martes;
    int Miercoles;
    int Jueves;
    int Viernes;
    int Sabado;
    int Domingo;
    
    switch (opcion) {
      case "lunes":
        System.out.println("El Lunes a primera hora toca Sistemas Informaticos");
        break;
    
      case "martes":
        System.out.println("El Martes a primera hora toca Programación");
        break;
    
      case "miercoles":
        System.out.println("El Miercoles a primera hora toca Programación");
        break;
        
      case "jueves":
        System.out.println("El Jueves a primera hora toca Base de Datos");
        break;        
        
      case "viernes":
        System.out.println("El Viernes a primera hora toca Lenguaje de Marcas");
        break;        
        
      default:
        System.out.print("\nLos Sábados y Domingos no hay clases.");
    }
  }
}
