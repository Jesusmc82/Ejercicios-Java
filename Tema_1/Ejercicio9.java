/**
* Escribe un programa que pinte por pantalla alguna escena - el campo, la
* habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
* - un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
* caracteres como *, +, <, #, @, etc. ¡Échale imaginación!
*
* @author Jesus Martin Castro
*/
public class Ejercicio9 {
    public static void main(String[] args) {
      String rojo = "\033[31m";
      String blanco = "\033[0m";
      String amarillo = "\033[93m";
        System.out.printf("\n");
        System.out.printf("%49s\n", blanco + "&&&&&&&&&&&&&&&&&&&&");
        System.out.printf("%30s %9s %10s\n", rojo + "&", "&", "&");
        System.out.printf("%24s %10s %11s\n", "&", "&", "&");
        System.out.printf("%23s %11s %12s\n", "&", "&", "&");
        System.out.printf("%13s %5s %9s %8s\n", "&&&&&&&", amarillo + "&&&&&&&", blanco + "==========================", rojo + "&&&&&&&&&&&");
        System.out.printf("%12s %11s %8s %2s %14s %5s %8s\n",    "&&&&&&&", amarillo + "&&&&&&&&", rojo + "&&&&&&&&&", blanco + "=", rojo + "&&&&&&&&&&&", blanco + "=", rojo + "&&&&&&&&&&&&&");
        System.out.printf("%12s %10s %8s\n", "&&&&&&&&", amarillo + "&&&&&&&", rojo + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.printf("%61s\n",  "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.printf("%61s\n", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.printf("%12s %8s %9s %30s %8s %9s\n", blanco + "&&", amarillo + "X", blanco + "&&", "&&", amarillo + "X", blanco + "&&");
        System.out.printf("%10s %5s %34s %5s\n", "&&", "&&", "&&", "&&");
        System.out.printf("%14s %40s\n", "&&&&", "&&&&");
    }
}
