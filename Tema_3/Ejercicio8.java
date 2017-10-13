/**
* Escribe un programa que calcule el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
*
* @author Jesus Martin Castro
*/
public class Ejercicio8 {
    public static void main(String[] args) {
      
      System.out.print("Dígame el número de horas trabajadas y le diré su salario ");
      System.out.println("a razón de 12 € por hora");
      System.out.print("¿Cuántas horas echó? ");
        int horas = Integer.parseInt(System.console().readLine());
        
        int calculoHoras= horas * 12;
        
      System.out.println("Su salario de esta semana según las horas que trabajó son: ");
      System.out.println(" " + horas + " x 12 = " + calculoHoras + " €");
      
    }
}
