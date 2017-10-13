/**
* Escribe un programa que calcule el volumen de un cono según la fórmula V =
* 1/3πr²h
*
* @author Jesus Martin Castro
*/
public class Ejercicio9 {
    public static void main(String[] args) {
      System.out.println("Calcularemos el volumen de un cono (por favor diga los valores en cm.");
      
      System.out.print("Diga la altura de su cono: ");
        double altura = Double.parseDouble(System.console().readLine());//variable para la altura solicitada
      System.out.print("Diga el radio de su cono: ");
        double radio = Double.parseDouble(System.console().readLine());//variable para el radio solicitado
        
        double volumen = (Math.PI*radio*radio*altura) / 3; //calculo del volumen del cono con su formula
        
      System.out.printf("El volumen de su cono es: %.2f cm³", volumen);//mostramos el resultado del volumen en centimetros cubicos.

    }
}
