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
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaUno = System.console().readLine().toLowerCase();
      if (respuestaUno.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaUno.equals("f")) {
        } else {
        }
      
    System.out.println("2- ¿Ha aumentado sus gastos de vestuario? ");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaDos = System.console().readLine().toLowerCase();
      if (respuestaDos.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaDos.equals("f")) {
        } else {
        }
        
    System.out.println("3- ¿Ha perdido el interés que mostraba anteriormente por ti?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaTres = System.console().readLine().toLowerCase();
      if (respuestaTres.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaTres.equals("f")) {
        } else {
        }
        
    System.out.print("4- ¿Ahora se afeita y se asea con más frecuencia (si");
    System.out.println(" es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?"); 
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaCuatro = System.console().readLine().toLowerCase();
      if (respuestaCuatro.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaCuatro.equals("f")) {
        } else {
        }
        
    System.out.println("5- ¿No te deja que mires la agenda de su teléfono móvil?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");  
      String respuestaCinco = System.console().readLine().toLowerCase();
      if (respuestaCinco.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaCinco.equals("f")) {
        } else {
        }
        
    System.out.println("6- ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaSeis = System.console().readLine().toLowerCase();
      if (respuestaSeis.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaSeis.equals("f")) {
        } else {
        }    
    
    System.out.println("7- ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaSiete = System.console().readLine().toLowerCase();
      if (respuestaSiete.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaSiete.equals("f")) {
        } else {
        }
        
    System.out.println("8- ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaOcho = System.console().readLine().toLowerCase();
      if (respuestaOcho.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaOcho.equals("f")) {
        } else {
        }
        
    System.out.println("9- ¿Has notado que últimamente se perfuma más?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaNueve = System.console().readLine().toLowerCase();
      if (respuestaNueve.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaOcho.equals("f")) {
        } else {
        }
        
    System.out.println("10- ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
    System.out.println("Responda: ");
    System.out.println("  - Verdadero (V) ");
    System.out.println("  - Falso (F) ");
      String respuestaDiez = System.console().readLine().toLowerCase();
      if (respuestaDiez.equals("v")) {
          puntos = puntos + 3;
        } else if (respuestaDiez.equals("f")) {
        } else {
        }
        
        System.out.println("Su puntuación es: " + puntos);
        
    if ((puntos >= 0) && (puntos <= 10)) {    
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((puntos>= 11) && (puntos <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente,");
      System.out.print(" aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((puntos>=23) && (puntos<=30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo ");
      System.out.print(" un romance con otra persona. Te aconsejamos que indagues ");
      System.out.println(" un poco más y averigües que es lo que está pasando por su cabeza.");
    } else {
    }
  }
} 
