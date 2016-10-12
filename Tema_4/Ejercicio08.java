/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio08 {
 
 public static void main(String[] args) {
    String linea;
    System.out.println("Cuáles su nota media de los tres exámenes: ");
    System.out.print("Exámen 1: ");
    linea = System.console().readLine();
    double notaExamen1;
    notaExamen1 = Double.parseDouble ( linea );
    System.out.print("Exámen 2: ");
    linea = System.console().readLine();
    double notaExamen2;
    notaExamen2 = Double.parseDouble ( linea );
    System.out.print("Exámen 3: ");
    linea = System.console().readLine();
    double notaExamen3;
    notaExamen3 = Double.parseDouble ( linea );
        
    double notaMedia;
    notaMedia = (notaExamen1 + notaExamen2 + notaExamen3) / 3;
    System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
    
    if (( notaMedia >= 0 ) && ( notaMedia <= 4.99 )) {
      System.out.println("Por lo que su nota del boletín será un: INSUFICIENTE");
    } else if (( notaMedia >= 5 ) && ( notaMedia <= 5.99 )) {
      System.out.println("Por lo que su nota del boletín será un: SUFICIENTE");
    } else if (( notaMedia >= 6) && ( notaMedia <= 6.99 )) {
      System.out.println("Por lo que su nota del boletín será un: BIEN");
    } else if (( notaMedia >= 7) && ( notaMedia <= 8.99 )) {
      System.out.println("Por lo que su nota del boletín será un: NOTABLE");
    } else if (( notaMedia >= 9) && ( notaMedia <= 10 )) {
      System.out.println("Por lo que su nota del boletín será un: SOBRESALIENTE");
     }
  }
}
