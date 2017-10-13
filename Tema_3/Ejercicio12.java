/**
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
*
* @author Jesus Martin Castro
*/
public class Ejercicio12 {
    public static void main(String[] args) {
      
      System.out.println("Diga cuántos Kb necesita pasar a Mb");
        double kb = Double.parseDouble(System.console().readLine());
        
        double mb = kb / 1024;
        
      System.out.println("Los " + kb + " Kb pasados a Mb suponen " + mb);
    }
}
