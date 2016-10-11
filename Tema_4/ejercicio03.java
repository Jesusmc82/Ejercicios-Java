/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 *
 * @author Jesus Martin Castro
 */

public class ejercicio03 {
  public static void main(String[] args) {
  
    System.out.println(" Escribe un número para saber el día de la semana correspondiente");
    System.out.print(" 1,");
    System.out.print(" 2,");
    System.out.print(" 3,");
    System.out.print(" 4,");
    System.out.print(" 5,");
    System.out.print(" 6,");
    System.out.println(" 7");
  
    int opcion = Integer.parseInt(System.console().readLine());

    int Lunes;
    int Martes;
    int Miercoles;
    int Jueves;
    int Viernes;
    int Sabado;
    int Domingo;
    
    switch (opcion) {
      case 1:
        System.out.println("El día de la semana correspondiente es: Lunes");
        break;
    
      case 2:
        System.out.println("El día de la semana correspondiente es: Martes");
        break;
    
      case 3:
        System.out.println("El día de la semana correspondiente es: Miercoles");
        break;
        
      case 4:
        System.out.println("El día de la semana correspondiente es: Jueves");
        break;        
        
      case 5:
        System.out.println("El día de la semana correspondiente es: Viernes");
        break;        
      
      case 6:
        System.out.println("El día de la semana correspondiente es: Sábado");
        break;        
      
      case 7:
        System.out.println("El día de la semana correspondiente es: Domingo");
        break;
        
      default:
        System.out.print("\nEse número no corresponde a ningún día de la semana.");
    }
  }
}
