/**
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
* @author Jesus Martin Castro
*/
public class Ejercicio21{
  public static void main(String[] args) {
    
    System.out.println("Meta varios números y le daré la suma y la media de todos ellos.");
    System.out.println("Introduzca todos los números que desee, para acabar introduzca un número negativo.");
    System.out.print("Pulse intro para continuar.");
    String linea = System.console().readLine();
        
      double suma = 0;
      double contador = 0;
      double numeroIntroducido;
      double numMax = 0;
      double impar = 0;
      double sumaImpar = 0;
      double mediaImpar = 0;
        
        do {
          
          System.out.print("Meta un número: "); //pedimos meter números hasta que se meta el negativo
            numeroIntroducido= Integer.parseInt(System.console().readLine()); 
          
              if (numeroIntroducido>=0) {//aquí comprobamos si el número es positivo, para poder hacer la suma y hayar la media de los mismos.
                suma = suma + numeroIntroducido;
                contador ++;
                  if (numeroIntroducido%2==0) { // comprobamos si el número es par y descartamos los impares.
                    if (numeroIntroducido > numMax) { // aquí comprobamos cuál de los números pares introducidos es mayor.
                      numMax = numeroIntroducido;
                    }
                  } else { // aquí sumamos los números impares y hayamos la media de los mismos.
                  impar ++;
                  sumaImpar = sumaImpar + numeroIntroducido;
                  mediaImpar = sumaImpar/impar;
                  }
              
              } else {
                
              }
        } while (numeroIntroducido >= 0);// decimos que se repita este bucle hasta que se introduzca un número negativo.
        
        if (contador > 0) {
          
          double media = suma / contador;
          System.out.println("Se han insertado " + contador + " números");
          System.out.println("La suma de sus números introducidos es: " + suma);
          System.out.println("La media de " + suma + " / " + contador + " = " + media);
          System.out.println("La suma de sus números impares introducidos es: " + sumaImpar);
          System.out.println("La media de números impares es " + sumaImpar + " / " + impar + " = " + mediaImpar);
          System.out.println("El mayor de los números pares introducidos es " + numMax);
        } else {
          System.out.print("No se ha podido calcular la media porque no se ");
          System.out.println("ha introducido ningún número positivo");
        }
  }
}
