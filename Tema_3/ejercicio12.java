/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 * @author Jesus Martin Castro
 */
import java.util.Scanner;
public class ejercicio12 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Nota del primer examen: ");
    linea = System.console().readLine();
    double notaPrimero;
    notaPrimero = Double.parseDouble ( linea );
    System.out.print("Nota del trimestre que desea sacar: ");
    linea = System.console().readLine();
    double mediaTrimestre;
    mediaTrimestre = Double.parseDouble ( linea );
    double notaSegundo;
    notaSegundo = ((mediaTrimestre - (notaPrimero * 0.4)) / 0.6);
    System.out.print("Si desea sacar un " + mediaTrimestre + " en el trimestre,");
    System.out.printf(" en el segundo examen deberia sacar %.2f", notaSegundo);    
  }
}
