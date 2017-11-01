/**
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
*
* @author Jesus Martin Castro
*/
public class Ejercicio17{
  public static void main(String[] args) {
    
    System.out.println("Dígame un número y le sumaré sus 100 siguientes números");
    System.out.print("Díga ahora su número: ");
      int numeroIntroducido= Integer.parseInt(System.console().readLine());
    
    int sumatorio = numeroIntroducido+1;
    int suma = 0;
    
    for (int control = 1; control <=100; control ++) {
      
      suma = suma + sumatorio;
      System.out.print("" + sumatorio + "+");
      sumatorio ++;
    }
    
    System.out.println(" = " + suma);
    System.out.print("El resultado de sumar los 100 primeros números es: " + suma);
  }
}
