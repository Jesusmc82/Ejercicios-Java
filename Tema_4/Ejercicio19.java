/**
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
* puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio19{
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo o negativo y le diré cuál es su primera cifra.");
      String linea = System.console().readLine();
    System.out.print("Introduzcalo ahora: ");
      int numeroIntroducido= Integer.parseInt(System.console().readLine());
      
      int primeraCifra = numeroIntroducido%10;
      int primeraCifra1 = numeroIntroducido%100/10;
      int primeraCifra2 = numeroIntroducido%1000/100;
      int primeraCifra3 = numeroIntroducido%10000/1000;
      int primeraCifra4 = numeroIntroducido%100000/10000;
      
    if ((numeroIntroducido <= 9) && (numeroIntroducido >= -9)) {
      System.out.println("El número introducido " + numeroIntroducido + " tiene 1 cifra");
    } else if ((numeroIntroducido <= 99) && (numeroIntroducido >= -99)) {
      System.out.println("El número introducido " + numeroIntroducido + " tiene 2 cfiras");
    } else if ((numeroIntroducido <= 999) && (numeroIntroducido >= -999)) {
      System.out.println("El número introducido " + numeroIntroducido + " tiene 3 cfiras");
    } else if ((numeroIntroducido <= 9999) && (numeroIntroducido >= -9999)) {
      System.out.println("El número introducido " + numeroIntroducido + " tiene 4 cfiras");
    } else if ((numeroIntroducido <= 99999) && (numeroIntroducido >= -99999)) {
      System.out.println("El número introducido " + numeroIntroducido + " tiene 5 cfiras");
    } else {
    }
  }
}
