/**
 * Horario de clase en colores
 *
 * @author Jesus Martin Castro
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[0m";
    String amarillo = "\033[93m";
    System.out.printf("%-6s  %1s  %5s  %2s  %6s  %1s  %9s  %1s  %6s  %1s  %6s  %1s\n", "Dia", "|", "Lunes", "|",  "Martes", "|",  "Miércoles", "|",  "Jueves", "|",  "Viernes", "|");
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s\n",  "Hora", "|");
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %6s  %1s  %9s  %7s  %11s  %8s  %8s  %8s  %10s  %7s\n", 08.15, "|", rojo + "S. Inf", blanco + "|", verde + "Prog", blanco + "|", verde + "Prog", blanco + "|", naranja + "BD", blanco + "|", azul + "LM", blanco + "|");
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %6s  %1s  %9s  %7s  %11s  %8s  %8s  %8s  %10s  %7s\n", 09.15, "|", rojo + "S. Inf", blanco + "|", verde + "Prog", blanco + "|", verde + "Prog", blanco + "|", naranja + "BD", blanco + "|", azul + "LM", blanco + "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %6s  %1s  %9s  %7s  %11s  %8s  %8s  %8s  %10s  %7s\n", 10.15, "|", rojo + "S. Inf", blanco + "|", verde + "Prog", blanco + "|", azul + "LM", blanco + "|", naranja + "BD", blanco + "|", amarillo + "ED", blanco + "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-7s %1s %48s %4s\n",  11.15, "|", "  R         E         C         R         E         O",     "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %5s  %8s  %8s  %8s  %11s  %8s  %8s  %7s  %8s  %6s\n", 11.45, "|", morado + "FOL", blanco + "|", naranja + "BD", blanco + "|", azul + "LM", blanco + "|", verde + "Prog", blanco + "|", rojo + "S. Inf", blanco + "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %5s  %8s  %8s  %8s  %11s  %8s  %8s  %7s  %8s  %6s\n", 12.45, "|", morado + "FOL", blanco + "|",  naranja + "BD", blanco + "|", amarillo + "ED", blanco + "|", verde + "Prog", blanco + "|", rojo + "S. Inf", blanco + "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-6s  %1s  %5s  %8s  %8s  %8s  %11s  %8s  %8s  %7s  %8s  %6s\n", 13.45, "|", morado + "FOL", blanco + "|", naranja + "BD", blanco + "|", amarillo + "ED", blanco + "|", verde + "Prog", blanco + "|", rojo + "S. Inf", blanco + "|");    
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%-2s  %2s  %2s\n", morado + "FOL: Formacion y Orientacion Laboral", verde + "Prog: Programación", amarillo + "ED: Entorno de Desarrollo");
    System.out.printf("%-2s  %2s  %2s\n", naranja + "BD: Base de Datos", rojo + "S. Inf: Sistemas Informaticos", azul + "LM: Lenguaje de Marcas");    
      }
}
