/**
* Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
* introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
* número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
* media”.
* Ejemplo:
* Por favor, introduzca diez números enteros positivos:
* 6
* 8
* 15
* 12
* 23
* 11
* 48
* 7
* 2
* 19
* La media de los primos es 12.4
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ex16jmc2 {
  public static void main(String[] args) { 
      
      System.out.println("Por favor, introduzca diez números enteros positivos: ");
      
      boolean esPrimo = true;
      double contador = 0;
      double numeroIntroducido = 0;
      int contadorPrimo = 0;
      double resultado = 0;
      double suma = 0;
        
        while (contador<=9) {
            
          numeroIntroducido= Integer.parseInt(System.console().readLine()); 
          esPrimo=true; 
          
          for (int division = 2; division < numeroIntroducido; division ++) { 
            
            if (numeroIntroducido % division == 0) {
            esPrimo = false;
            
            }
          }
           
          if (esPrimo) {
            contadorPrimo++;
            suma += numeroIntroducido;
          }
        
        contador ++;
        
        } 
        
    double media = suma/contadorPrimo;
    
    if (contadorPrimo!=0) {
        System.out.print("La media de los primos es " + media);
    } else {
        System.out.print("No ha introducido ningún número primo, no puedo calcular la media.");
    } 
  }
}
