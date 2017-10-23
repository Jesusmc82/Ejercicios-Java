/**
* Realiza un programa que calcule el √ tiempo que tardará en caer un objeto desde 2
* una altura h. Aplica la fórmula t = 2h g siendo g = 9.81m/s
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 {
    public static void main(String[] args) {
      System.out.print("Calculareos el tiempo que su objeto tarda en caer.");
        String linea = System.console().readLine();
      System.out.print("Diga a altura desde la que cae el objeto: ");
        int altura = Integer.parseInt(System.console().readLine());
        double resultado = Math.sqrt ((2*altura)/9.81);//Math.sqrt para realizar raiz cuadrada en Java.
      if (altura == 0) {  
      System.out.println("Ese dato no es válido");
      } else if (altura > 0) {
        System.out.println("Su objeto tardará en caer " + resultado + " segundos");
      } else if (altura <= 0) {
        System.out.println("No existen valores negativos de altura.");
      } else {
    }
  }
}
