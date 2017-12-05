/**
* Define tres arrays de 20 números enteros cada una, con nombres numero ,
* cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
* array cuadrado se deben almacenar los cuadrados de los valores que hay en el
* array numero . En el array cubo se deben almacenar los cubos de los valores que
* hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
* en tres columnas.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 {
  public static void main(String[] args){
    
    System.out.print("Voy a generar 20 números aleatorios y le mostraré su cuadrado y cubo(pulse INTRO para continuar): ");
    System.console().readLine();
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    System.out.println();
    
    for (int i = 0; i < 20; i++) {
      
      numero[i] = (int)(Math.random()* 100);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
      
      System.out.printf("%3d %9d²= %1d %9d³= %1d\n", numero[i], numero[i], cuadrado[i], numero[i], cubo[i]);
      System.out.println("-------------------------------------");
    }
  }
}
