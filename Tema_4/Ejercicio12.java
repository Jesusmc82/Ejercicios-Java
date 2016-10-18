/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio12 {
 
 public static void main(String[] args) {
   
   System.out.println("Veamos qué ha aprendido hasta ahora en el curso:");
    
     int puntos = 0;
     
    System.out.println("1ª pregunta - ¿Qué es Java?: ");
    System.out.println("a) es un lenguaje de programación");
    System.out.println("b) forma parte del hardware del ordenador");
    System.out.println("c) Una cosa rara que solo entienden unos pocos");
    System.out.println("respuesta: ");
    String respuestaPrimera = System.console().readLine().toLowerCase();
    if (respuestaPrimera.equals("a")) {
      puntos++;
      System.out.println("Ha acertado la primera pregunta, continuemos");
    } else if ((respuestaPrimera.equals("b")) || (respuestaPrimera.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }  
    
    System.out.println("2ª pregunta - ¿Quién fue Charles Goldfarb?: ");
    System.out.println("a) Fue el inventor de la primera computadora");
    System.out.println("b) Es el dueño de Google");
    System.out.println("c) Es considerado el padre del lenguaje de marcas");
    System.out.println("respuesta: ");
    String respuestaSegunda = System.console().readLine().toLowerCase();
    if (respuestaSegunda.equals("c")) {
      puntos++;
      System.out.println("Ha acertado la segunda pregunta, continuemos");
    } else if ((respuestaSegunda.equals("a")) || (respuestaSegunda.equals("b"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("3ª pregunta - ¿Qué es un cluster?: ");
    System.out.println("a) Las partes del disco duro.");
    System.out.println("b) El responsable de darle corriente al ordenador.");
    System.out.print("c) varios ordenadores conectados entre si, ");
    System.out.println("trabajando como si fueran uno solo.");
    System.out.print("respuesta: ");
    String respuestaTercera = System.console().readLine().toLowerCase();
    if (respuestaTercera.equals("c")) {
      puntos++;
      System.out.println("Ha acertado la tercera pregunta, continuemos");
    } else if ((respuestaTercera.equals("a")) || (respuestaTercera.equals("b"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("4ª pregunta - Linux es un: ");
    System.out.println("a) Un programa de gestión de fotos");
    System.out.println("b) Un sistema operativo de código abierto");
    System.out.println("c) Un programa para gestionar bases de datos");
    System.out.print("respuesta: ");
    String respuestaCuarta = System.console().readLine().toLowerCase();
    if (respuestaCuarta.equals("b")) {
      puntos++;
      System.out.println("Ha acertado la cuarta pregunta, continuemos");
    } else if ((respuestaCuarta.equals("a")) || (respuestaCuarta.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("5ª pregunta - ¿Qué quiere decir que sea de código libre?: ");
    System.out.println("a) Que no hay que pagar por tenerlo");
    System.out.println("b) Se puede ver todo su código de programación, pero no modificarlo");
    System.out.print("c) Permite al usuario utilizar, cambiar, mejorar el software y"); 
    System.out.println(" redistribuirlo, ya sea en su forma modificada o en su forma original.");
    System.out.print("respuesta: ");
    String respuestaQuinta = System.console().readLine().toLowerCase();
    if (respuestaQuinta.equals("c")) {
      puntos++;
      System.out.println("Ha acertado la quinta pregunta, continuemos");
    } else if ((respuestaQuinta.equals("a")) || (respuestaQuinta.equals("b"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.print("6ª pregunta - ¿Dónde nos pide Luis, profesor de programación, ");
    System.out.println("subamos los repositorios?: ");
    System.out.println("a) Facebook");
    System.out.println("b) Github");
    System.out.println("c) Instagram");
    System.out.print("respuesta: ");
    String respuestaSexta = System.console().readLine().toLowerCase();
    if (respuestaSexta.equals("b")) {
      puntos++;
      System.out.println("Ha acertado la sexta pregunta, continuemos");
    } else if ((respuestaSexta.equals("a")) || (respuestaSexta.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("7ª pregunta - ¿Cuá es la mascota de Github?: ");
    System.out.println("a) Un gato");
    System.out.println("b) Un pingüino");
    System.out.println("c) Un perro");
    System.out.print("respuesta: ");
    String respuestaSeptima = System.console().readLine().toLowerCase();
    if (respuestaSeptima.equals("a")) {
      puntos++;
      System.out.println("Ha acertado la septima pregunta, continuemos");
    } else if ((respuestaSeptima.equals("b")) || (respuestaSeptima.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("8ª pregunta - ¿Quién fue el creador de Linux?: ");
    System.out.println("a) Bill Gates");
    System.out.println("b) Steve Jobs");
    System.out.println("c) Linus Torvalds");
    System.out.print("respuesta: ");
    String respuestaOctava = System.console().readLine().toLowerCase();
    if (respuestaOctava.equals("c")) {
      puntos++;
      System.out.println("Ha acertado la octava pregunta, continuemos");
    } else if ((respuestaOctava.equals("a")) || (respuestaOctava.equals("b"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("9ª pregunta ¿Qué comando se utiliza en Linux para crear una carpeta?: ");
    System.out.println("a) mkdir");
    System.out.println("b) mjdir");
    System.out.println("c) mhdir");
    System.out.print("respuesta: ");
    String respuestaNovena = System.console().readLine().toLowerCase();
    if (respuestaNovena.equals("a")) {
      puntos++;
      System.out.println("Ha acertado la novena pregunta, continuemos");
    } else if ((respuestaNovena.equals("b")) || (respuestaNovena.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
    
    System.out.println("10ª pregunta ¿Para qué sirve el comando cd ..?: ");
    System.out.println("a) Reproducir música con la terminal de Linux");
    System.out.println("b) Bajar de un directorio superior a otro inferior en la terminal");
    System.out.println("c) Comprobar que archivos tenemos en un directorio");
    System.out.print("respuesta: ");
    String respuestaDecima = System.console().readLine().toLowerCase();
    if (respuestaDecima.equals("b")) {
      puntos++;
      System.out.println("Ha acertado la decima pregunta");
    } else if ((respuestaDecima.equals("a")) || (respuestaDecima.equals("c"))) {
      System.out.println("Lo siento, ha fallado la respuesta, continuemos");
    } else {
      System.out.println("La respuesta ha de ser a, b o c");
    }
         
      System.out.println("Ahora sepamos cuál será tu puntuación");
      System.out.println("Tu puntuación ha sido de: " + puntos);
 
        if (puntos >=5) {
          System.out.println("¡Enhorabuena!");
          } else {
        System.out.println("Necesitas esforzarte más");
    }
  }
}
