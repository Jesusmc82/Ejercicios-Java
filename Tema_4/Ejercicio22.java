 /**
 * 
 *Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 *hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 *Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 *por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 *a las 15:00h.
 * 
 *@author Jesus Martin Castro
 * 
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("¿Quieres saber lo que queda para el fin de semana?");
    System.out.println("Introduce día, hora y minutos que son");
    
    String dia = System.console().readLine().toLowerCase();
    
    if (dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")) {
      System.out.println("No es correcto este día");
    }
    
    System.out.print("¿Qué hora es?: ");
    
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas >24) {
      System.out.println("Esa hora no es correcta");
    }
    
    System.out.print("Ahora los minutos: ");
    
    int minutos = Integer.parseInt(System.console().readLine());
    
    if (minutos >60) {
      System.out.println("Los minutos introducidos son incorrectos");
    }
        
    int minutosTotales = (horas * 60) + minutos;
    
    int startWeekend = 8100;
    
    int dayToMinutes = 0;
    
    switch (dia) {
      case "lunes":
        dayToMinutes = 1;
      break;
      
      case "martes":
        dayToMinutes = 2;
      break;
      
      case "miercoles":
        dayToMinutes = 3;
      break;
      
      case "jueves":
        dayToMinutes = 4;
      break;
      
      default:
              
    }
  System.out.println("El tiempo restante para el fin de semana es: " + (startWeekend - (minutosTotales + (dayToMinutes * 1440))));
  
  }
}
