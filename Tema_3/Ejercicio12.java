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
      
      System.out.println("¿Qué nota sacó en el primer examen?");//pedimos la nota que sacó en el primer examen
        double notaPrimerExamen = Double.parseDouble(System.console().readLine());//variable para la nota del primer examen
      
      System.out.println("Ahora ponga la nota que desea sacar en el trimestre");//solicitamos la nota que se desea sacar en el trimestre
        double notaFinTrimestre = Double.parseDouble(System.console().readLine());//variable para la nota del trimestre
      
        double restanteNota = notaFinTrimestre - ((notaPrimerExamen * 40) / 100);//aquí calculamos el 40% de importancia del primer examen y sacamos el resto de la nota para la nota del segundo examen
        double notaSegundoExamen = (restanteNota * 100) / 60;//dado el resultado de la resta anterior calculamos el total del segundo examen
        
      System.out.printf("La nota que debe sacar en el segundo examen deberá ser: %.2f", notaSegundoExamen);//mostramos el total de la nota que se ha de sacar en el segundo examen
    }
}
