/**
* Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche.
*
* @author Jesus Martin Castro
*/
public class Ejercicio11 {
    public static void main(String[] args) {
      System.out.print("¿Quiere saber cuántos segundos quedan para medianoche?");
        String linea = System.console().readLine();
      System.out.print("¿Qué hora es? (pongalo en formato de 24 h.): ");
        int hora = Integer.parseInt(System.console().readLine());
      System.out.print("¿Y qué minutos? ");
        int minutos = Integer.parseInt(System.console().readLine());
        
        int total = ((24 * 60) - ((hora * 60) + minutos)) * 60;//En esta variable calculamos los segundos que quedan para medianoche, primero calculando los segundos que hay en 24 horas, después los minutos que son dada las hora tomada por teclado sumandolo a los minutos, y todo conjunto lo pasamos a segundos.

        
      System.out.println("Son las " + hora + ":" + minutos + " quedan para medianoche " + total + " segundos");
      System.out.print("Que en minutos son " + (total / 60));
  }
}
