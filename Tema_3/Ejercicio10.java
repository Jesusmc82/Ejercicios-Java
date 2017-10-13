/**
* Realiza un conversor de Mb a Kb.
*
* @author Jesus Martin Castro
*/
public class Ejercicio10 {
    public static void main(String[] args) {
      
      System.out.println("Diga cuántos Mb necesita pasar a Kb");
        double mb = Double.parseDouble(System.console().readLine());
        
        double kb = mb * 1024;
        
      System.out.println("Los " + mb + " Mb pasados a Kb suponen " + kb);
    }
}
