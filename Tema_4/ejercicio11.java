/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Jesus Martin Castro
 */
public class ejercicio11 { 
 public static void main(String[] args) {
   
   String linea;
   System.out.print("Averigüemos los segundos que quedan para medianoche");
   linea = System.console().readLine();
   
   System.out.print("\nDígame para empezar solo la hora: ");
   int hora= Integer.parseInt(System.console().readLine());
   
   System.out.print("Ahora introduzca los minutos: ");
   int minutos= Integer.parseInt(System.console().readLine());
  
   int horaSegundos = hora * 3600;
   int minutosSegundos = minutos * 60;
   int segundos = 86400 - (horaSegundos + minutosSegundos);
   
   System.out.println("\nA las " + hora + ":" + minutos + " quedan "+ segundos + " segundos para medianoche");
  }
}
