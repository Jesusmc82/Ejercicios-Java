/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio07 {
 
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
    System.out.printf("La nota media que va a obtener es un %.2f", notaMedia);
  }
}
