/**
 *
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
 * za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
 * del programa.
 *
 * @author Jesus Martin Castro
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
  String linea;
   System.out.println("Vamos a definir si tu pareja te es infiel o no:");
   System.out.println("Contesta con verdadero (v) o falso(f)");
   System.out.println("Por favor pulse [INTRO] para continuar");    
   linea = System.console().readLine();
    
     int puntos = 0;
     
     
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("¿Verdadero (v) o Falso (f)?");
    String respuesta1 = System.console().readLine().toUpperCase();  
    if (respuesta1.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta1.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }

   System.out.println("");
    
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.println("¿Verdadero (v) o Falso (f)?");
    String respuesta2 = System.console().readLine().toUpperCase();  
     if (respuesta2.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta2.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }      
    
    System.out.println("");
     
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("¿Verdadero (v) o Falso (f)?");      
    String respuesta3 = System.console().readLine().toUpperCase(); 
     if (respuesta3.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta3.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
    
    System.out.println("");
     
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora ");
    System.out.println("se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("¿Verdadero (v) o Falso (f)?");      
    String respuesta4 = System.console().readLine().toUpperCase();   
     if (respuesta4.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta4.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
     
    System.out.println(""); 
     
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("¿Verdadero (v) o Falso (f)?");            
    String respuesta5 = System.console().readLine().toUpperCase(); 
     if (respuesta5.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta5.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
    
    System.out.println(""); 
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("¿Verdadero (v) o Falso (f)?");
    String respuesta6 = System.console().readLine().toUpperCase(); 
    if (respuesta6.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta6.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
    
    System.out.println("");   
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("¿Verdadero (v) o Falso (f)?");   
    String respuesta7 = System.console().readLine().toUpperCase(); 
     if (respuesta7.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta7.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
     
    System.out.println("");   
     
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("¿Verdadero (v) o Falso (f)?");        
    String respuesta8 = System.console().readLine().toUpperCase(); 
     if (respuesta8.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta8.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
                     
    System.out.println("");   

    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.println("¿Verdadero (v) o Falso (f)?");                              
    String respuesta9 = System.console().readLine().toUpperCase(); 
     if (respuesta9.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta9.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
        
    System.out.println("");   
     
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("¿Verdadero (v) o Falso (f)?");                                  
    String respuesta10 = System.console().readLine().toUpperCase();                   
     if (respuesta10.equals("V")) {
      puntos = puntos + 3;
    } else if (respuesta10.equals("F")) {
      puntos = puntos + 0;
    } else {
      System.out.println("Por favor conteste unicamente con verdadero (v) o falso (f)");
    }
  
   System.out.println("");  
   
   System.out.println("Ya tenemos los resultados, ahora veremos los puntos obtenidos: " + puntos);
   
   linea = System.console().readLine();
      
   System.out.println("Con respecto a esa puntuación la conclusión de este test es:");
   
   linea = System.console().readLine();
       
       if ((puntos >= 0) && (puntos <= 10)) {
      System.out.println("¡Enhorabuena!, su pareja parece ser totalmente fiel.");
    } else if ((puntos >= 11) && (puntos <= 22)) {  
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque");
      System.out.println(" seguramente será algo sin importancia. No baje la guardia.");
    } else if ((puntos > 22) && (puntos <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con");
      System.out.print(" otra persona. Te aconsejamos que indagues un poco más y averigüe qué es");
      System.out.println(" lo que está pasando por su cabeza.");
    }
  }
}  
