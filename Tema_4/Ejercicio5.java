/**
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
* b = 0).
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 {
    public static void main(String[] args) {
      System.out.println("Vamos a resolver la siguien ecuación ax + b = 0 ");
        String linea = System.console().readLine();
      System.out.print("Diga el primer número ");
        int primerNumero = Integer.parseInt(System.console().readLine());
      System.out.print("Diga el segundo número ");
        int segundoNumero = Integer.parseInt(System.console().readLine());
        
        if ((primerNumero == 0) && (segundoNumero == 0)) {
        System.out.println("Estos no son números para resolver la ecuación");
      } else {
      }
        double resultado = - primerNumero / segundoNumero;
      if (resultado == 0) {  
      System.out.println("El resultado de su operación es 0, ¡¡FELICIDADES!!");
      } else if (resultado > 0) {
        System.out.println("El resultado de su operación es " + resultado + " Lo siento pero no es un buen resultado.");
      } else if (resultado < 0) {
        System.out.println("El resultado de su operación es " + resultado + " Lo siento pero no es un buen resultado.");
      } else {
    }
  }
}
