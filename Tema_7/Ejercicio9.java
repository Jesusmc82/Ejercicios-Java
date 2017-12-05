/**
* Realiza un programa que pida 8 números enteros y que luego muestre esos
* números junto con la palabra “par” o “impar” según proceda.
*
* @author Jesus Martin Castro
*/
public class Ejercicio9 {
  public static void main(String[] args){
    
    int[] numero = new int[8];
        
    for (int i = 0; i < 8; i++) {
      System.out.print("Inserte un número ");
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] % 2 == 0) {
        System.out.println("par");
      } else {
        System.out.println("impar");
      }
    }
  }
}
