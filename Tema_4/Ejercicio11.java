/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio11 {
 
 public static void main(String[] args) {
  
    System.out.println("Calculemos los segundos que quedan para medianoche");
  
    System.out.print("¿Hora?: ");
    int hora = Integer.parseInt(System.console().readLine());
   
    System.out.print("¿Minutos?: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosHora = (hora * 3600) + (minutos * 60);
    int segundos = 86400 - segundosHora;
    
    System.out.println("desde " + hora + ":" + minutos + " estos son los segundos hasta medianoche " + segundos);
  }
}
    
    
