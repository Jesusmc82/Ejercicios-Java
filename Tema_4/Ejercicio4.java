/**
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 {
    public static void main(String[] args) {
      System.out.print("Dígame el número de horas trabajadas y le diré su salario ");
      System.out.println("a razón de 12 € las 40 primeras horas y a 16 € las restantes horas.");
      System.out.print("¿Cuántas horas echó? ");
        int horas = Integer.parseInt(System.console().readLine());
      if (horas <= 40) {  
      System.out.println("El total a cobrar por " + horas + " es de: " + horas*12 + " Euros");
      } else if (horas > 40) {
        int horaMayor = horas - 40;
        int totalHoras = (40 * 12) + (horaMayor * 16);
      System.out.println("El total a cobrar por " + horas + " es de: " + totalHoras + " Euros");
      }else{
    }
  }
}
