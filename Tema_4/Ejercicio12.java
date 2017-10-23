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
      System.out.print("Vamos a realizar un pequeño cuestionario sobre lo que llevamos de curso");
      System.out.print(" por cada respuesta correcta se llevará un punto.");
        String linea = System.console().readLine();
        int puntos = 0;
      
      System.out.println("1- ¿Quién es el profesor de programación? ");
      System.out.println("A) Luis José");
      System.out.println("B) Antonio José");
      System.out.println("C) Eva");
      System.out.print("Responda ahora: \n");
        String primeraRespuesta = System.console().readLine().toLowerCase();
        if (primeraRespuesta.equals("a")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (primeraRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (primeraRespuesta.equals("c")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
      
      System.out.println("2- ¿Qué lenguaje de programación nos enseña Luis José? ");
      System.out.println("A) Javascrip");
      System.out.println("B) PHP");
      System.out.println("C) Java");
      System.out.print("Responda ahora: \n");
        String segundaRespuesta = System.console().readLine().toLowerCase();
        if (segundaRespuesta.equals("c")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (segundaRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (segundaRespuesta.equals("a")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
      
      System.out.println("3- ¿Qué número en decimal es este número binario 11? ");
      System.out.println("A) 3");
      System.out.println("B) 10");
      System.out.println("C) 1");
      System.out.print("Responda ahora: \n");
        String terceraRespuesta = System.console().readLine().toLowerCase();
        if (terceraRespuesta.equals("a")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (terceraRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (terceraRespuesta.equals("c")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
      
      System.out.println("4- ¿En Java cómo sería una impresión por pantalla con salto de línea? ");
      System.out.println("A) System.out.print");
      System.out.println("B) System.out.println");
      System.out.println("C) System.out.printf");
      System.out.print("Responda ahora: \n");
        String cuartaRespuesta = System.console().readLine().toLowerCase();
        if (cuartaRespuesta.equals("b")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (cuartaRespuesta.equals("a")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (cuartaRespuesta.equals("c")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
        
      System.out.println("5- ¿Qué es una primary key? ");
      System.out.println("A) Clave foranea para unificar dos tablas");
      System.out.println("B) Clave principal de una tabla");
      System.out.println("C) Ninguna de las anteriores");
      System.out.print("Responda ahora: \n");
        String quintaRespuesta = System.console().readLine().toLowerCase();
        if (quintaRespuesta.equals("b")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (quintaRespuesta.equals("a")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (quintaRespuesta.equals("c")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
        
      System.out.println("6- ¿Para qué utilizamos este código img src= en una página web?");
      System.out.println("A) Insertar una imagen en la web");
      System.out.println("B) Crear un enlace a otra web");
      System.out.println("C) Poner una tabla en la web");
      System.out.print("Responda ahora: \n");
        String sextaRespuesta = System.console().readLine().toLowerCase();
        if (sextaRespuesta.equals("a")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (sextaRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (sextaRespuesta.equals("c")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
        
      System.out.println("7- ¿Linux es considerado un software libre?");
      System.out.println("A) No");
      System.out.println("B) Es medio libre y medio comercial");
      System.out.println("C) Si");
      System.out.print("Responda ahora: \n");
        String septimaRespuesta = System.console().readLine().toLowerCase();
        if (septimaRespuesta.equals("c")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (septimaRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (septimaRespuesta.equals("a")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
      
      System.out.println("8- sudo apt install lo usamos en Linux pero ¿para qué se usa?");
      System.out.println("A) crear usuarios");
      System.out.println("B) instalar aplicaciones");
      System.out.println("C) cambiar una contraseña");
      System.out.print("Responda ahora: \n");
        String octavaRespuesta = System.console().readLine().toLowerCase();
        if (octavaRespuesta.equals("b")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (octavaRespuesta.equals("c")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (octavaRespuesta.equals("a")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
        
      System.out.println("9- Para pasar un número decimal a hexadecimal ¿qué debemos hacer?");
      System.out.println("A) Agrupaciones de 3 BITS + tabla");
      System.out.println("B) Divisiones entre 8");
      System.out.println("C) Divisiones entre 16");
      System.out.print("Responda ahora: \n");
        String novenaRespuesta = System.console().readLine().toLowerCase();
        if (novenaRespuesta.equals("c")) {
            System.out.print("Respuesta correcta, continuamos\n");
            puntos = puntos + 1;
          } else if (novenaRespuesta.equals("b")) {
            System.out.print("respuesta incorrecta, continuamos\n");
          } else if (novenaRespuesta.equals("a")) {
          System.out.print("Respuesta incorrecta, continuamos\n");
        }
        
      System.out.println("10- ¿Qué es un programa informático?");
      System.out.print("A) es una notación o conjunto de símbolos y caracteres combinados ");
      System.out.print("entre sí de acuerdo con una sintaxis ya definida para posibilitar la transmisión");
      System.out.println("de instrucciones a la CPU");
      System.out.println("B) Conjunto unitario de instrucciones que permite a un ordenador realizar funciones diversas");
      System.out.println("C) El conjunto de instrucciones depende de la CPU del ordenador.");
      System.out.print("Responda ahora: \n");
        String decimaRespuesta = System.console().readLine().toLowerCase();
        if (decimaRespuesta.equals("b")) {
            System.out.print("Respuesta correcta, hemos acabado, a continuación su puntuación\n");
            puntos = puntos + 1;
          } else if (decimaRespuesta.equals("c")) {
            System.out.print("respuesta incorrecta, hemos acabado, a continuación su puntuación\n");
          } else if (decimaRespuesta.equals("a")) {
          System.out.print("Respuesta incorrecta, hemos acabado, a continuación su puntuación\n");
        }
        
      System.out.print("Su puntuación es: " + puntos);
  }
} 
