/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Jesus Martin Castro
 */

public class ejercicio01 {
  public static void main(String[] args) {
    System.out.print("¿Qué día de la semana desea saber? ");
    String respuesta = System.console().readLine();

    if (respuesta.equals("Lunes")) {
      System.out.println("El Lunes a primera hora toca Sistemas Informaticos");
    } else if (respuesta.equals("Martes")) {
      System.out.println("El Martes a primera hora toca Programación");
    } else if (respuesta.equals("Miercoles")) {
      System.out.println("El Miercoles a primera hora toca Programación");
    } else if (respuesta.equals("Jueves")) {
      System.out.println("El Jueves a primera hora toca Base de Datos");
    } else if (respuesta.equals("Viernes")) {
      System.out.println("El Viernes a primera hora toca Lenguaje de Marcas");
    } else {
      System.out.println("Los Sábados y Domingos no hay clases");
    }
  }
}
