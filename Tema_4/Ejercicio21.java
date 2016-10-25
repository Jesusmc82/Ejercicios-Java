/**
 *
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 * mantiene la nota media anterior.
 *
 * @author Jesus Martin Castro
 */
 
public class Ejercicio21 {
  public static void main(String[] args) {
  
    System.out.println("\nNota del primer examen: ");
    double notaPrimero;
    notaPrimero = Double.parseDouble(System.console().readLine());
    System.out.println("Nota del segundo examen: ");
    double notaSegundo;
    notaSegundo = Double.parseDouble(System.console().readLine());
    double mediaTrimestre;
    mediaTrimestre = (notaSegundo + notaPrimero)  / 2;
    System.out.println("La media de su trimestre es " + mediaTrimestre);    
  
   if (mediaTrimestre < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        mediaTrimestre = 5;
      }
    }
    
    System.out.print("Tu nota de Programación es " + mediaTrimestre);
  }
}
