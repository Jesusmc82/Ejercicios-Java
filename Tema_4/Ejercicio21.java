/**
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
public class Ejercicio21{
  public static void main(String[] args) {
  
    System.out.print("Le hayaré la nota medía del trimestre de programación.");
      String Linea= System.console().readLine();

    System.out.print("¿Qué nota sacó en el primer examen? ");
      double notaPrimerExamen = Double.parseDouble(System.console().readLine());

    System.out.print("Ahora dígame la segunta nota: ");
      double notaSegundoExamen = Double.parseDouble(System.console().readLine());
      
      if ((notaPrimerExamen < 0) || (notaSegundoExamen < 0)) {
        System.out.println("La nota media no se puede hayar con números negativos");
      }
      
      double notaFinTrimestre = (notaSegundoExamen + notaPrimerExamen) / 2;
    
     if ((notaFinTrimestre >= 0) && (notaFinTrimestre < 5)) {
        System.out.println("La media le da un insuficiente= " + notaFinTrimestre);
      } else if ((notaFinTrimestre >= 5) && (notaFinTrimestre < 6)) {
        System.out.println("La media le da un suficiente= " + notaFinTrimestre);
      } else if ((notaFinTrimestre >= 6) && (notaFinTrimestre < 7)) {
        System.out.println("La media le da un bien= " + notaFinTrimestre);
      } else if ((notaFinTrimestre >= 7) && (notaFinTrimestre < 9)) {
        System.out.println("La media le da un notable= " + notaFinTrimestre);
      } else if ((notaFinTrimestre >= 9) && (notaFinTrimestre <= 10)) {
        System.out.println("La media le da un sobresaliente= " + notaFinTrimestre);
      } else {
    }
   
    if ((notaFinTrimestre >= 0) && (notaFinTrimestre < 5)) {
      System.out.println("¿Qué nota sacó en el examen de recuperación?");
      String respuesta = System.console().readLine().toLowerCase();
        if (respuesta.equals ("apto")) {
          System.out.println("La nota que tendrá en el trimestre es un 5");
        } else {
          System.out.println("La nota que tendrá en el trimestre será la media obtenida: " + notaFinTrimestre);
        }
    } else {
    }
  }
}
