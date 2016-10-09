/**
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
* @author Jesus Martin Castro
*/

public class ejercicio04 {
  public static void main(String[] args) {
   String linea;
    System.out.print("Numero de horas que echó: ");
    linea = System.console().readLine();
    int numeroHoras;
    numeroHoras = Integer.parseInt ( linea );
    if ( numeroHoras <= 40) {
    System.out.println( "A razón de 12 € las 40 primeras horas ud. cobrará:" );
    System.out.println( "12 € * " + numeroHoras + " h. = " + numeroHoras * 12 + (" €"));
    System.out.println( "El dinero por " + numeroHoras + " h. son " + numeroHoras * 12 + " €");
  }else{
    }if ( numeroHoras >= 41){
    int x = 12 * 40;
    int h = (numeroHoras - 40);
    int y = (h * 16);
    int j = ((numeroHoras - 40) * 16 + 480);
    System.out.println( "A razón de 12 € las 40 primeras horas y 16 € las restantes ud. cobrará:" );
    System.out.println( "12 € * 40 h. = " + x + "  €" );
    System.out.println( "16 € * " + h + " h. =  " + y + " €" );
    System.out.println( x + " € + " + y + " € = " + j + " €" );
    System.out.println( "El dinero por " + numeroHoras + " h. son " + j + " €" );
  }else{
   }
  }
}
