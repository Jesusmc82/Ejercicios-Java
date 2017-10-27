/**
* Escribe un programa que pinte una pirámide rellena con un carácter introdu-
* cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
* -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
* el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
* izquierda o hacia la derecha.
*
* @author Jesus Martin Castro
*/
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una piramide con el carácter que ud. desee y en el sentido que desee.");
      String linea = System.console().readLine();
    System.out.print("Para empezar diga el carácter que desee: ");
      String caracter = System.console().readLine();
    System.out.println("¿Qué sentido desea tenga la pirámide?: ");
    System.out.println("1. Sentido arriba: ");
    System.out.println("2. Sentido abajo: ");
    System.out.println("3. Sentido derecha: ");
    System.out.println("4. Sentido izquiera: ");
      int eleccion= Integer.parseInt(System.console().readLine());
      
    switch (eleccion) {
          
          case 1:
            System.out.println("     "+ caracter);
            System.out.println("    "+ caracter + caracter + caracter);
            System.out.println("   "+ caracter + caracter + caracter + caracter + caracter);
            System.out.println("  "+ caracter + caracter + caracter + caracter + caracter + caracter + caracter);
            System.out.println(" "+ caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
          break;
          case 2:
            System.out.println(" "+ caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
            System.out.println("  "+ caracter + caracter + caracter + caracter + caracter + caracter + caracter);
            System.out.println("   "+ caracter + caracter + caracter + caracter + caracter);
            System.out.println("    "+ caracter + caracter + caracter);
            System.out.println("     "+ caracter);
          break;
          case 3:
            System.out.println(" " + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println(" " + caracter);
          break;
          case 4:
            System.out.println("     " + caracter);
            System.out.println("    " + caracter + caracter);
            System.out.println("   " + caracter + caracter + caracter);
            System.out.println("  " + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter + caracter + caracter);
            System.out.println("  " + caracter + caracter + caracter + caracter);
            System.out.println("   " + caracter + caracter + caracter);
            System.out.println("    " + caracter + caracter);
            System.out.println("     " + caracter);
          break;
    default:
            System.out.print("Esa elección no se encuentra dentro de las posibles ");
            System.out.println("elecciones del sentido de la pirámide");
    
    }
  }
}
