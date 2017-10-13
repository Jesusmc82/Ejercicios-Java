/**
* Realiza un conversor de Mb a Kb.
*
* @author Jesus Martin Castro
*/
public class Ejercicio11 {
    public static void main(String[] args) {
      
      System.out.println("Diga cuántos Kb necesita pasar a Mb");
        double kb = Double.parseDouble(System.console().readLine());
        
        double mb = kb / 1024;
        
      System.out.println("Los " + kb + " Kb pasados a Mb suponen " + mb);
    }
}
