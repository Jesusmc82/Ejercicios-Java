/**
 *
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 *
 */
 
public class Ejercicio15 {
  public static void main(String[] args) {

      System.out.println("Dibujemos una piramide con un solo caracter.");
      System.out.println("1. Piramide hacia arriba");
      System.out.println("2. Piramide hacia abajo");
      System.out.println("3. Piramide hacia la izquierda");
      System.out.println("4. Piramide hacia la derecha");    
   
    int direccionPiramide = Integer.parseInt(System.console().readLine());
          
      System.out.println("¿Con qué caracter desea que sea dibujada?");
      System.out.println("(Puede elegir números, letras o incluso signos de puntuación)");
    String caracter = System.console().readLine();


      switch (direccionPiramide) {
      
    case 1:
      System.out.println();
      System.out.println("  " + caracter);
      System.out.println(" " + caracter + caracter + caracter);
      System.out.println(caracter + caracter + caracter + caracter + caracter);
      break;
      
      case 2:
      System.out.println();
      System.out.println(caracter + caracter + caracter + caracter + caracter);
      System.out.println(" " + caracter + caracter + caracter);
      System.out.println("  " + caracter);
      break;
      
      case 3:
      System.out.println();
      System.out.println("    " + caracter);
      System.out.println("  " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter);
      System.out.println("  " + caracter + " " + caracter);
      System.out.println("    " + caracter);
      break;
      
      case 4:
      System.out.println();
      System.out.println(caracter);
      System.out.println(caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter);
      System.out.println(caracter);
      break;
  default:
    
    System.out.println("Esa opcion no está entre las posibles");
    }
  }
}
