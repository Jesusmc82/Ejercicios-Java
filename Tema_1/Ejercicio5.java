/**
* Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-
* natura de un color diferente.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 { // Clase principal
    public static void main(String[] args) {
      String rojo = "\033[31m";
      String verde = "\033[32m";
      String naranja = "\033[33m";
      String azul = "\033[34m";
      String morado = "\033[35m";
      String blanco = "\033[37m";
      String celeste = "\033[36m";
        System.out.printf("%1s %7s %10s %7s %9s", blanco+ "Lunes", "Martes", "Miércoles", "Jueves", "Viernes\n");
        System.out.printf("%6s %13s %13s %14s %9s", verde + "S I", naranja + "Prog", verde + "S I", naranja + "Prog", "Prog\n");
        System.out.printf("%6s %13s %13s %14s %9s", verde + "S I", naranja + "Prog", verde + "S I", naranja + "Prog", "Prog\n");
        System.out.printf("%6s %13s %13s %14s %13s", verde + "S I", naranja + "Prog", verde + "S I", naranja + "Prog", morado + "E D\n");
        System.out.printf("%1s %4s %7s %9s %7s %7s", blanco + "R", "E", "C", "R", "E", "O\n");
        System.out.printf("%4s %12s %14s %14s %13s", rojo + "FOL", azul + "B D", morado + "E D", azul + "B D", celeste + "L M\n");
        System.out.printf("%4s %12s %14s %14s %13s", rojo + "FOL", azul + "B D", morado + "E D", azul + "B D", celeste + "L M\n");
        System.out.printf("%4s %12s %14s %14s %13s", rojo + "FOL", azul + "B D", celeste + "L M", azul + "B D", celeste + "L M\n");
        System.out.println();
        System.out.printf("%1s %17s", azul + "B D=Base de Datos", rojo + "FOL=Formacion y orientación laboral\n");
        System.out.printf("%1s %17s", naranja + "Prog= Programacion", celeste + "L M= Lenguaje de Marcas\n");
        System.out.printf("%1s %9s", verde + "S I= Sistemas Informáticos", morado + "E D= Entorno de Desarrollos\n");
    }
}
