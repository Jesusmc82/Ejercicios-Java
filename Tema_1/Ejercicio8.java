/**
* Escribe un programa que pinte por pantalla una pirámide rellena a base de
* asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio8 {
    public static void main(String[] args) {
      String verde = "\033[32m";
        System.out.println("Dibujaremos una pirámide invertida\n");
        System.out.printf("%21s", verde + "*********\n");
        System.out.printf("%8s %6s", "*", "*\n");
        System.out.printf("%9s %4s", "*", "*\n");
        System.out.printf("%10s %2s", "*", "*\n");
        System.out.printf("%12s", "*\n");
    }
}
