/**
* Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
* positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
* primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
* cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
* Ejemplo:
* Por favor, vaya introduciendo números enteros positivos. Para terminar,
* introduzca un número primo:
* 6
* 8
* 15
* 12
* 23
* Ha introducido 4 números no primos.
* Máximo: 15
* Mínimo: 6
* Media: 10.25
*
* @author Jesus Martin Castro
*/
public class EjercicioEx01{
  public static void main(String[] args) {
    
    System.out.println("Meta varios números y le daré el mayor y minimo de ellos, y la media de todos ellos.");
    System.out.println("Introduzca todos los números que desee, para acabar introduzca un número primo.");
    System.out.print("Pulse intro para continuar.");
    String linea = System.console().readLine();
        
      boolean esPrimo = true;
      double contador = 0;
      double numeroIntroducido;
      double numMax = Integer.MIN_VALUE;//declaración de variable para ayudar a buscar el número maximo introducido por teclado.
      double numMin = Integer.MAX_VALUE;//declaración de variable para ayudar a buscar el número minimo introducido por teclado.
      double resultado = 0;
      double suma = 0;
        
        do {
          System.out.print("Meta un número: ");
            numeroIntroducido= Integer.parseInt(System.console().readLine()); 
            esPrimo = true;
          
         
            for (int division = 2; division < numeroIntroducido; division ++) {
            resultado = numeroIntroducido % division;
              if (resultado == 0) {
              esPrimo= false;
              }
            }
          
                if ((numeroIntroducido>=0) && (!esPrimo)) {
                suma = suma + numeroIntroducido;
                contador ++;
                  if (numeroIntroducido > numMax) { 
                      numMax = numeroIntroducido;
                  } 
                  if (numeroIntroducido < numMin) {
                      numMin = numeroIntroducido;
                  }
              
              } else {
                
              }
        } while (!esPrimo);
        
        if (esPrimo && (contador > 0)) {
          
          double media = suma / contador;
          System.out.println("Cantidad números introducidos " + contador);
          System.out.println("Maximo " + numMax);
          System.out.println("Minimo " + numMin);
          System.out.println("Suma " + suma);
          System.out.println("Media " + media);
          System.out.println("Primo " + numeroIntroducido);
        } else {
          System.out.println("Por favor meta algún número no primo para poder realizar el programa");
        }
  }
}
