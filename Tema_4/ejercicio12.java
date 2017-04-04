/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 *
 * @author Jesus Martin Castro
 */
public class ejercicio12 { 
 public static void main(String[] args) {
  
  String linea;
  System.out.print("Vamos a realizar un pequeño cuestionario de 10 preguntas ");
  System.out.println("sobre el curso para saber tus conocimientos sobre el mismo");
  linea = System.console().readLine();
  
  System.out.println("Vamos adelante");
  linea = System.console().readLine();
  
  System.out.print("¡¡SUERTE!!\n");
  linea = System.console().readLine();
  
  int puntos = 0;
  
  System.out.println("- 1ª pregunta:");
  System.out.println("   Un programa informático es:");
  System.out.println("a. un conjunto de instrucciones que realizan una tarea y que son ejecutables por un ordenador.");
  System.out.println("b. un conjunto de instrucciones que realiza un algoritmo matemático estadístico.");
  System.out.println("c. Ninguna de las anteriores.");
   String respuestaUno = System.console().readLine().toLowerCase();
    if (respuestaUno.equals ("a")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaUno.equals ("b")) || (respuestaUno.equals ("c"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
  
  System.out.println("- 2ª pregunta:");
  System.out.println("   Qué es un Sistema Operativo:");
  System.out.println("a. es un programa para el arreglo y mejora de archivo jpg.");
  System.out.println("b. es un software para la edición y mejora de documentos y archivos pdf");
  System.out.print("c. es el software principal o conjunto de programas de un sistema informático");
  System.out.println(" que gestiona los recursos de hardware y provee servicios a los programas de aplicación de software");
   String respuestaDos = System.console().readLine().toLowerCase();
    if (respuestaDos.equals ("c")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaDos.equals ("a")) || (respuestaDos.equals ("b"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
  
  System.out.println("- 3ª pregunta:");
  System.out.println("   ¿Cuál es la función que realizan los navegadores con el código HTML?");
  System.out.println("a. Compilar esa información y crear un código objeto.");
  System.out.println("b. Interpretar esa información y mostrar un resultado visible por el usuario.");
  System.out.println("c. No realizan ninguna función.");
   String respuestaTres = System.console().readLine().toLowerCase();
    if (respuestaTres.equals ("b")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaTres.equals ("a")) || (respuestaTres.equals ("c"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
      
  System.out.println("- 4ª pregunta:");
  System.out.println("   El diseño de una base de datos consta de:");
  System.out.print("a. Diseño Conceptual, donde podemos usar el Modelo E/R , Diseño Lógico (será el modelo");
  System.out.println(" relacional), donde podemos usar el Diagrama de Estructura de Datos o DED y el diseño físico.");
  System.out.print("b. Diseño Conceptual, donde podemos usar el Modelo E/R y Diseño Lógico (será el modelo ");
  System.out.println("relacional), donde podemos usar el Diagrama de Estructura de Datos o DED, únicamente.");
  System.out.println("c. Introducir los datos sin realizar ningún diseño previo.");
   String respuestaCuatro = System.console().readLine().toLowerCase();
    if (respuestaCuatro.equals ("a")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaCuatro.equals ("b")) || (respuestaCuatro.equals ("c"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
          
  System.out.println("- 5ª pregunta:");
  System.out.println("   ¿Qué es la memoria RAM?:");
  System.out.print("a. Discos de aluminio. Perfectamente pulidos y recubiertos de una");
  System.out.println(" película de componentes férricos.");
  System.out.println("b. Es un circuito impreso que soporta todos los componentes y elementos de un ordenador.");
  System.out.print("c. La memoria es un dispositivo que almacena los datos con los que trabaja el procesador. ");
  System.out.println("Almacena datos de usuario e instrucciones de los programas.");
   String respuestaCinco = System.console().readLine().toLowerCase();
    if (respuestaCinco.equals ("c")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaCinco.equals ("a")) || (respuestaCinco.equals ("b"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
 
  System.out.println("- 6ª pregunta:");
  System.out.println("   Definición de JAVA:");
  System.out.print("a. lenguaje de programación de propósito general, concurrente, orientado a objetos que");
  System.out.println(" fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.");
  System.out.println("b. Se define como orientado a objetos, basado en prototipos, imperativo, débilmente tipado y dinámico.");
  System.out.println("c. es un lenguaje de código abierto muy popular especialmente adecuado para el desarrollo web y que puede ser incrustado en HTML.");
   String respuestaSeis = System.console().readLine().toLowerCase();
    if (respuestaSeis.equals ("a")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaSeis.equals ("b")) || (respuestaSeis.equals ("c"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      } 
 
  System.out.println("- 7ª pregunta:");
  System.out.println("   ¿Quién es considerada como la primera programadora?:");
  System.out.println("a. Virginia Woolf.");
  System.out.println("b. Marge Simpson.");
  System.out.println("c. Ada Augusta King.");
   String respuestaSiete = System.console().readLine().toLowerCase();
    if (respuestaSiete.equals ("c")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaSiete.equals ("a")) || (respuestaSiete.equals ("b"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }
      
  System.out.println("- 8ª pregunta:");
  System.out.println("   ¿Para qué funciona la BIOS?:");
  System.out.print("a. Sus funciones principales incluyen el manejo del ");
  System.out.print("sistema operativo, la ejecución de las aplicaciones y la ");
  System.out.println("coordinación de los diferentes dispositivos que componen el equipo."); 
  System.out.print("b. se utiliza como memoria de trabajo de computadoras ");
  System.out.println("para el sistema operativo, los programas y la mayor parte del software.");
  System.out.print("c. El propósito fundamental del BIOS es iniciar y probar ");
  System.out.print("el hardware del sistema y cargar un gestor de arranque o ");
  System.out.println("un sistema operativo desde un dispositivo de almacenamiento de datos.");
   String respuestaOcho = System.console().readLine().toLowerCase();
    if (respuestaOcho.equals ("c")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaOcho.equals ("a")) || (respuestaOcho.equals ("b"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }

  System.out.println("- 9ª pregunta:");
  System.out.print("   La siguiente definición a qué se refiere: Sus funciones principales incluyen el manejo del ");
  System.out.print("sistema operativo, la ejecución de las aplicaciones y la ");
  System.out.println("coordinación de los diferentes dispositivos que componen el equipo.");
  System.out.println("a. Memoria RAM");
  System.out.println("b. Procesador.");
  System.out.println("c. Placa Base.");
   String respuestaNueve = System.console().readLine().toLowerCase();
    if (respuestaNueve.equals ("b")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaNueve.equals ("a")) || (respuestaNueve.equals ("c"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
      }      
 
  System.out.println("- 10ª pregunta:");
  System.out.println("   ¿Qué es el RTF?");
  System.out.println("coordinación de los diferentes dispositivos que componen el equipo.");
  System.out.print("a. Tipo de lenguaje de marca utilizado para producir documentos científicos que incluyen ");
  System.out.println("entre otros elementos, expresiones matemáticas e intenta simplificar a TeX.");
  System.out.print("b. Es un subconjunto de SGML ideado para mejorarlo y permite definir lenguajes de marcado con ");
  System.out.println("sintaxis más estricta pero más entendibles.");
  System.out.print("c. un lenguaje ideado por Microsoft para producir documentos de texto que ");
  System.out.println("incluyan anotaciones de formato.");
   String respuestaDiez = System.console().readLine().toLowerCase();
    if (respuestaDiez.equals ("c")){
      puntos++;
      System.out.println("¡¡Correcto!!\n");
      }else if((respuestaDiez.equals ("a")) || (respuestaDiez.equals ("b"))){
          System.out.println("No es la respuesta correcta\n");
        }else{
          System.out.println("La respuesta debe ser a, b o c\n");
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
