/**
* Escribe un programa que diga cuál es la última cifra de un número entero
* introducido por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio17{
  public static void main(String[] args) {
    System.out.print("Voy hayar el último digito de su número entero introducido por pantalla.");
      String linea = System.console().readLine();
    System.out.print("Introduzcalo ahora: ");
      int numeroIntroducido= Integer.parseInt(System.console().readLine());
      
      int ultimaCifra = numeroIntroducido%10;
      
    System.out.println("El último digito introducido de su número " + numeroIntroducido + " es: " + ultimaCifra);
  }
}
