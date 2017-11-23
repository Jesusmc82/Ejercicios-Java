/**
* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
* aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
* final aparecerá el número de suspensos, el número de suficientes, el número
* de bienes, etc.
*
* @author Jesus Martin Castro
*/
public class Ejercicio11 {
  public static void main(String[] args) {
  
    int nota = 0;
    int numeroNota = 20;
    int suspenso = 0;
    int suficiente = 0;
    int bien= 0;
    int notable= 0;
    int sobresaliente= 0;
    
    for (int i = 1; i<= numeroNota; i++) {
      nota = (int)(Math.random()*11);
      if ((nota >= 0) && (nota <= 4)) {
        System.out.print(" Suspensos, ");
        suspenso++;
      } else if (nota == 5) {
        System.out.print(" Suficiente, ");
        suficiente++;
      } else if (nota == 6) {
        System.out.print(" Bien, ");
        bien++;
      } else if ((nota >= 7) && (nota <= 8)) {
        System.out.print(" Notable, ");
        notable++;
      } else if ((nota >= 9) && (nota <= 10)) {
        System.out.print(" Sobresaliente, ");
        sobresaliente++;
      }
    } 
      System.out.println();
      System.out.println("___________________");
      System.out.println("Total suspensos= " + suspenso);
      System.out.println("Total suficiente= " + suficiente);
      System.out.println("Total Bien= " + bien);
      System.out.println("Total Notable= " + notable);
      System.out.println("Total Sobresaliente= " + sobresaliente);
  }
}
