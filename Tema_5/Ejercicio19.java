/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 *
 * @Jesus Martin Castro
 */
  public class Ejercicio19 {
  public static void main(String[] args) {

    System.out.println("Dibujemos una pirámide");
    System.out.print("Diga la altura que desea tenga la pirámide: ");
    int altura= Integer.parseInt(System.console().readLine());
    System.out.println("Ahora diga con que caracter desea dibujar la pirámide");
    System.out.print("(recuerde que puede ser @, *, /, a, b, ....) ");
    String relleno = System.console().readLine();
    
    
  }
}
