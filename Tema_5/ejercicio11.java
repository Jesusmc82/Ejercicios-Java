/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @Jesus Martin Castro
 */
public class ejercicio11 {
  public static void main(String[] args) {
  
    int numero;
    int control= 1; 
    int cuadrado = 0;
    int cubo = 0;
    System.out.println("Diga un número y le diŕe el cuadrado y el cubo de ese dígito y sus 5 números siguientes.");
    System.out.println("Diga ahora su número elegido: ");
    numero= Integer.parseInt(System.console().readLine());
    System.out.println("Numero   Cuadrado   Cubo\n");
    cuadrado=numero * numero;
    cubo=numero * numero * numero;
    System.out.printf("%4d %8d %10d", numero, cuadrado, cubo);

    do{
      control++;
      numero++;
      cuadrado=numero * numero;
      cubo=numero * numero * numero;
      System.out.printf("\n%4d %8d %10d", numero, cuadrado, cubo);
    }while (control<5);
  }
 }
