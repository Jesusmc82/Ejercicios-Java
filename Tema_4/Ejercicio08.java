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
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String amarillo = "\033[93m";
    String blanco = "\033[0m";
    
    if ((notaExamen1 < 0 ) || (notaExamen2 < 0 ) || (notaExamen3 < 0 )){
      System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
    
    } else if (( notaExamen1 > 10 ) || ( notaExamen2 > 10 ) || ( notaExamen3 > 10 )){    
    System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
  
  } else if (( notaMedia >= 0 ) && ( notaMedia <= 4.99 )) {
      System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
      System.out.printf("Por lo que su nota del boletín será un: ");
      System.out.printf(rojo + "INSUFICIENTE\n" + blanco);
    
    } else if (( notaMedia >= 5 ) && ( notaMedia <= 5.99 )) {
      System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
      System.out.printf(blanco + "Por lo que su nota del boletín será un: ");
      System.out.printf(verde + "SUFICIENTE\n" + blanco);
    
    } else if (( notaMedia >= 6) && ( notaMedia <= 6.99 )) {
      System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
      System.out.printf(blanco + "Por lo que su nota del boletín será un: ");
      System.out.printf(azul + " BIEN\n" + blanco);
    
    } else if (( notaMedia >= 7) && ( notaMedia <= 8.99 )) {
      System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
      System.out.printf(blanco + "Por lo que su nota del boletín será un: ");
      System.out.printf(naranja + " NOTABLE\n" + blanco);
    
    } else if (( notaMedia >= 9) && ( notaMedia <= 10 )) {
      System.out.printf("La nota media que va a obtener es un %.2f\n", notaMedia);
      System.out.printf(blanco + "Por lo que su nota del boletín será un: ");
      System.out.printf(amarillo + "SOBRESALIENTE\n" + blanco);
     }
  }
}
