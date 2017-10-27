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
public class Ejercicio22{
  public static void main(String[] args) {
  
    System.out.print("¿Te encuentras aburrido en clase y estás deseando que llegue el fin de semana?");
      String linea = System.console().readLine();
    System.out.print("Pues vamos a calcular el tiempo que queda hasta el Viernes a las 15 h.");  
      String salto = System.console().readLine();
    System.out.print("¿En qué día nos encontramos? (Pon en letras) ");
      String dia = System.console().readLine().toLowerCase();
    System.out.print("¿Qué hora es? (pongalo en formato de 24 h.): ");
      int hora = Integer.parseInt(System.console().readLine());
    System.out.print("¿Y qué minutos? ");
      int minutos = Integer.parseInt(System.console().readLine());
        
      if (((hora >= 0) && (hora <= 24)) && ((minutos >= 0) && (minutos <= 59))) {
          
          int total = (15 * 60) - (24 * 60);
          
        switch (dia) {
              
          case "lunes":   
            int diaCuatro = (((hora * 60) + minutos) - total)*4;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaCuatro + " para el fin de semana");
          break;
          
          case "martes":   
            int diaTres = (((hora * 60) + minutos) - total)*3;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaTres + " para el fin de semana");
          break;
     
          case "miercoles":        
          case "miércoles":   
            int diaDosUno = (((hora * 60) + minutos) - total)*2;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaDosUno + " para el fin de semana");
          break;
          
          case "jueves":   
            int diaUno = ((hora * 60) + minutos) - total;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaUno + " para el fin de semana");
          break;
          
          case "viernes":   
              int diaSiete;
              if ((dia.equals ("viernes")) && (hora == 15) && (minutos > 00)) {
                diaSiete = ((15 * 60) + (24 * 60) * 7) - ((hora * 60) + minutos);
                System.out.println("Para el Viernes a las 15.00 te quedan  " + diaSiete + " para el fin de semana");
              }else{
                diaSiete = (15 * 60) - ((hora * 60) + minutos);
                System.out.println("Para el Viernes a las 15.00 te quedan  " + diaSiete + " para el fin de semana");
              }
          break;
          
          case "sabado":
          case "sábado":   
            int diaSeisUno = (((hora * 60) + minutos) - total)*6;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaSeisUno + " para el fin de semana");
          break;
          
          case "domingo":   
            int diaCinco = (((hora * 60) + minutos) - total)*5;
            System.out.println("Para el Viernes a las 15.00 te quedan  " + diaCinco + " para el fin de semana");
          break;
          
        default:
          System.out.print("Ese día no es válido");
      }
    
    } else {
      System.out.println("Ese margen horario no es adecuado");
    }
  }
}
