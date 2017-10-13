/**
* Escribe un programa que muestre tu horario de clase.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 { // Clase principal
    public static void main(String[] args) {
        System.out.printf("%1s %7s %10s %7s %9s", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes\n");
        System.out.printf("%4s %7s %7s %10s %9s", "S I", "Prog", "S I", "Prog", "Prog\n");
        System.out.printf("%4s %7s %7s %10s %9s", "S I", "Prog", "S I", "Prog", "Prog\n");
        System.out.printf("%4s %7s %7s %10s %9s", "S I", "Prog", "S I", "Prog", "E D\n");
        System.out.printf("%1s %4s %7s %9s %7s %7s", "R", "E", "C", "R", "E", "O\n");
        System.out.printf("%4s %7s %7s %9s %10s", "FOL", "B D", "E D", "B D", "L M\n");
        System.out.printf("%4s %7s %7s %9s %10s", "FOL", "B D", "E D", "B D", "L M\n");
        System.out.printf("%4s %7s %7s %9s %10s", "FOL", "B D", "L M", "B D", "L M\n");
        System.out.println();
        System.out.printf("%4s %9s", "B D= Base de Datos", "FOL= Formacion y orientación laboral\n");
        System.out.printf("%4s %9s", "Prog= Programacion", "L M= Lenguaje de Marcas\n");
        System.out.printf("%4s %9s", "S I= Sistemas Informáticos", "E D= Entorno de Desarrollos\n");
    }
}
