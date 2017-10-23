/**
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de
* nacimiento.
*
* @author Jesus Martin Castro
*/
public class Ejercicio10 {
    public static void main(String[] args) {
      System.out.print("Digame su día y mes de nacimiento y le diré cuál es su horoscopo");
        String linea = System.console().readLine();
      System.out.print("¿Cuál es su día de nacimiento?: ");
        int diaNacimiento = Integer.parseInt(System.console().readLine());
      System.out.print("¿Y su mes? ");
        String mesNacimiento = System.console().readLine().toLowerCase();
      
      if (mesNacimiento.equals("enero")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Capricornio");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Acuario");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
      
      if (mesNacimiento.equals("febrero")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Acuario");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 29)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Piscis");
        } else if (diaNacimiento >= 30) {
          System.out.print("" + mesNacimiento + " solamente tiene 29 días, cuando es un año bisiesto");
        }
      }
      
      if (mesNacimiento.equals("marzo")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Piscis");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Aries");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        } 
      }
      
      if (mesNacimiento.equals("abril")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Aries");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 30)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Tauro");
        } else if (diaNacimiento >= 31) {
          System.out.print("" + mesNacimiento + " solamente tiene 30 días");
        }
      }
      if (mesNacimiento.equals("mayo")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Tauro");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Geminis");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
      
      if (mesNacimiento.equals("junio")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Geminis");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 30)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Cancer");
        } else if (diaNacimiento >= 31) {
          System.out.print("" + mesNacimiento + " solamente tiene 30 días");
        }
      }
    
      if (mesNacimiento.equals("julio")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Cancer");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Leo");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
    
      if (mesNacimiento.equals("agosto")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Leo");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Virgo");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
    
      if (mesNacimiento.equals("septiembre")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Virgo");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 30)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Libra");
        } else if (diaNacimiento >= 31) {
          System.out.print("" + mesNacimiento + " solamente tiene 30 días");
        }
      }
    
      if (mesNacimiento.equals("octubre")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Libra");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Escorpio");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
    
      if (mesNacimiento.equals("noviembre")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Escorpio");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 30)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Sagitario");
        } else if (diaNacimiento >= 31) {
          System.out.print("" + mesNacimiento + " solamente tiene 30 días");
        }
      }
    
      if (mesNacimiento.equals("diciembre")) {
        if ((diaNacimiento >= 1) && (diaNacimiento < 21)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Sagitario");
        } else if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
          System.out.print("Su horoscopo dada su fecha de nacimiento " + diaNacimiento + " " + mesNacimiento + " es: Capricornio");
        } else if (diaNacimiento >= 32) {
          System.out.print("" + mesNacimiento + " solamente tiene 31 días");
        }
      }
  }
}
