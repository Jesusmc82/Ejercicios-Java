/**
* Realiza un programa que calcule la media de tres notas.
*
* @author Jesus Martin Castro
*/
public class Ejercicio7 {
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
      } else if ((notaUno > 0) || (notaDos > 0) || (notaTres > 0)) {
        System.out.println("La nota media que le sale es " + media);
      } else {
    }
  }
}
