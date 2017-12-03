/**
* Escribe un programa que, dado un número introducido por teclado, elija al azar
* uno de sus dígitos.
* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 406783
* 7
* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 406783
* 3
* Ejemplo 3:
* Por favor, introduzca un número entero positivo: 406783
* 0
*
* @author Jesus Martin Castro
*/
public class Ejercicio24 {
  public static void main(String[] args){
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int contadorNumero = 0;
    int volteado = 0;
    int numeroEscogido = 0;
    int digito = 0;
      
      while (numeroIntroducido >= 1) {
        volteado = (volteado * 10) + numeroIntroducido % 10;
        numeroIntroducido /= 10;
        contadorNumero++;  
      }

      numeroEscogido = (int)(Math.random()* contadorNumero)+1;
      
      for (int i = 1; i <= numeroEscogido; i++) {
        digito = volteado % 10;
        volteado /= 10;
      }
      
      System.out.println(digito);
  }
}
