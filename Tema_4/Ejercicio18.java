/**
* Escribe un programa que diga cuál es la primera cifra de un número entero
* introducido por teclado. Se permiten números de hasta 5 cifras.
*
* @author Jesus Martin Castro
*/
public class Ejercicio18{
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y le diré cuál es su primera cifra.");
      String linea = System.console().readLine();
    System.out.print("Introduzcalo ahora: ");
      int numeroIntroducido= Integer.parseInt(System.console().readLine());
      
      int primeraCifra = numeroIntroducido%10;
      int primeraCifra1 = numeroIntroducido%100/10;
      int primeraCifra2 = numeroIntroducido%1000/100;
      int primeraCifra3 = numeroIntroducido%10000/1000;
      int primeraCifra4 = numeroIntroducido%100000/10000;
      int primeraCifra5 = numeroIntroducido%1000000/100000;    
      
    if ((numeroIntroducido <= 9) && (numeroIntroducido >= -9)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra);
    } else if ((numeroIntroducido <= 99) && (numeroIntroducido >= -99)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra1);
    } else if ((numeroIntroducido <= 999) && (numeroIntroducido >= -999)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra2);
    } else if ((numeroIntroducido <= 9999) && (numeroIntroducido >= -9999)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra3);
    } else if ((numeroIntroducido <= 99999) && (numeroIntroducido >= -99999)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra4);
    } else if ((numeroIntroducido <= 999999) && (numeroIntroducido >= -999999)) {
    System.out.println("El primer digito introducido de su número " + numeroIntroducido + " es: " + primeraCifra5);
    } else {
    }
  }
}
