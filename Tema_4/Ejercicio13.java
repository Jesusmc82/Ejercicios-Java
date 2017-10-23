/**
* Escribe un programa que ordene tres números enteros introducidos por
* teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio13 {
  public static void main(String[] args) {
      
    System.out.println("Le pediré tres números enteros distintos y se los ordenaré de mayor a menor");
      String linea = System.console().readLine();
    System.out.print("Escriba ahora el primer número: ");
      int primerNumero= Integer.parseInt(System.console().readLine());
    System.out.print("Segundo número: ");
      int segundoNumero= Integer.parseInt(System.console().readLine());
    System.out.print("Tercer número: ");
      int tercerNumero= Integer.parseInt(System.console().readLine());
        
    if ((primerNumero < segundoNumero) && (segundoNumero < tercerNumero) && (primerNumero < tercerNumero)) {
          System.out.print("El orden de sus números es: " + primerNumero + " " + segundoNumero + " " + tercerNumero);
      }
    if ((segundoNumero < primerNumero) && (primerNumero > tercerNumero) && (segundoNumero < tercerNumero)) {
          System.out.print("El orden de sus números es: " + segundoNumero + " " + tercerNumero + " " + primerNumero);
    }
    if ((segundoNumero < primerNumero) && (primerNumero < tercerNumero) && (segundoNumero < tercerNumero)) {
          System.out.print("El orden de sus números es: " + segundoNumero + " " + primerNumero + " " + tercerNumero);
    }
    if ((tercerNumero < primerNumero) && (tercerNumero < segundoNumero) && (segundoNumero < primerNumero)) {
          System.out.print("El orden de sus números es: " + tercerNumero + " " + segundoNumero + " " + primerNumero);
    }
    if ((tercerNumero < primerNumero) && (tercerNumero < segundoNumero) && (segundoNumero > primerNumero)) {
          System.out.print("El orden de sus números es: " + tercerNumero + " " + primerNumero + " " + segundoNumero);
    }
  }
}
