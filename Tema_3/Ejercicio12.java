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
      
      System.out.println("¿Quiere saber que nota debe sacar en su segundo examen para saber la nota que desea sacar en el trimestre?");
      System.out.println("Dígame la nota del primer examen y la nota que desea sacar al final de curso.");
      System.out.println("¿Qué nota sacó en el primer examen?");
        double notaPrimerExamen = Double.parseDouble(System.console().readLine());
      System.out.println("Ahora ponga a nota que desea sacar en el curso");
        double notaFinCurso = Double.parseDouble(System.console().readLine());
        double importanciaPrimerExamen = (notaPrimerExamen * 40) / 100;
        double restanteNota =  notaFinCurso - importanciaPrimerExamen;
        double notaSegundoExamen = (restanteNota * 100) / 60;
        
      System.out.println("La nota que debe sacar en el segundo examen deberá ser: " + notaSegundoExamen);
    }
}
