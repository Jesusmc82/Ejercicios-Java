/**
* Escribe un programa que pinte por pantalla una pirámide rellena a base de
* asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 {
    public static void main(String[] args) {
      String verde = "\033[32m";
        System.out.println("Dibujaremos una pirámide\n");
        System.out.printf("%17s", verde + "*\n");
        System.out.printf("%13s", "***\n");
        System.out.printf("%14s", "*****\n");
        System.out.printf("%15s", "*******\n");
        System.out.printf("%16s", "*********\n");
    }
}
