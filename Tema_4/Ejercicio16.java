/**
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
* que se imparten en el curso. Cada pregunta acertada sumará un punto. El
* programa mostrará al final la calificación obtenida. Pásale el minicuestionario
* a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
* mientos en las diferentes asignaturas del curso.
*
* @author Jesus Martin Castro
*/
public class Ejercicio16{
  public static void main(String[] args) {
    System.out.print("Vamos a realizar un pequeño cuestionario sobre lo que llevamos de curso");
    System.out.print(" por cada respuesta correcta se llevará un punto.");
      String linea = System.console().readLine();
      int puntos = 0;
      
    System.out.println("1- ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente? ");
    System.out.print("Responda: ");
      String respuestaUno = System.console().readLine().toLowerCase();
      if (respuestaUno.equals("verdadero")) {
          puntos ++;
        } else if (respuestaUno.equals("falso")) {
        } else {
        }
      
    System.out.println("2- ¿Ha aumentado sus gastos de vestuario? ");
    System.out.print("Responda: ");
      String respuestaDos = System.console().readLine().toLowerCase();
      if (respuestaDos.equals("verdadero")) {
          puntos ++;
        } else if (respuestaDos.equals("falso")) {
        } else {
        }
        
    System.out.println("3- ¿Ha perdido el interés que mostraba anteriormente por ti?");
    System.out.print("Responda: ");
      String respuestaTres = System.console().readLine().toLowerCase();
      if (respuestaTres.equals("verdadero")) {
          puntos ++;
        } else if (respuestaTres.equals("falso")) {
        } else {
        }
        
    System.out.print("4- ¿Ahora se afeita y se asea con más frecuencia (si");
    System.out.println(" es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?"); 
    System.out.print("Responda: ");
      String respuestaCuatro = System.console().readLine().toLowerCase();
      if (respuestaCuatro.equals("verdadero")) {
          puntos ++;
        } else if (respuestaCuatro.equals("falso")) {
        } else {
        }
        
    System.out.println("5- ¿No te deja que mires la agenda de su teléfono móvil?");
    System.out.print("Responda: ");
      String respuestaCinco = System.console().readLine().toLowerCase();
      if (respuestaCinco.equals("verdadero")) {
          puntos ++;
        } else if (respuestaCinco.equals("falso")) {
        } else {
        }
        
    System.out.print("Su puntuación es: " + puntos);
  }
} 
