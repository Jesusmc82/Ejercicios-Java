/**
* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
* suficiente, bien, notable o sobresaliente).
*
* @author Jesus Martin Castro
*/
public class Ejercicio8 {
    public static void main(String[] args) {
      System.out.print("Vamos a calcular la media de sus tres notas.");
        String linea = System.console().readLine();
      System.out.print("Diga su primera nota: ");
        int notaUno = Integer.parseInt(System.console().readLine());
      System.out.print("Diga su segunda nota: ");
        int notaDos = Integer.parseInt(System.console().readLine());
      System.out.print("Diga su tercera nota: ");
        int notaTres = Integer.parseInt(System.console().readLine());
        
        double media = (notaUno + notaDos + notaTres) / 3;
      
      if ((notaUno < 0) || (notaDos < 0) || (notaTres < 0)) {
        System.out.println("La nota media no se puede hayar con números negativos");
      } else if ((media == 0) && (media < 5)) {
        System.out.println("La media le da un insuficiente= " + media);
      } else if ((media >= 5) && (media < 6)) {
        System.out.println("La media le da un suficiente= " + media);
      } else if ((media >= 6) && (media < 7)) {
        System.out.println("La media le da un bien= " + media);
      } else if ((media >= 7) && (media < 9)) {
        System.out.println("La media le da un notable= " + media);
      } else if ((media >= 9) && (media <= 10)) {
        System.out.println("La media le da un sobresaliente= " + media);
      } else {
    }
  }
}
