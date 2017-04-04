/*
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 * debe introducir por teclado.
 *
 * @Jesus Martin Castro
 */
public class ejercicio12 {
  public static void main(String[] args) {
  
    int primerFibo= 0;
    int segundoFibo= 1;
    int aux;
    int control= 0; 
    
    System.out.println("Dígame un digito y le díre los 5 números consecutivos de la serie Fibonacci.");
    System.out.println("Inserte ahora su número: ");
    control= Integer.parseInt(System.console().readLine());
    
    if (control==0){
      System.out.print("0");
    }else if (control==1){
      System.out.print("0 1");
    }else{
      System.out.print("\n0 1");
    }
    
    while (control>2){
      aux= primerFibo;
      primerFibo=segundoFibo;
      segundoFibo= aux+segundoFibo;
      System.out.print(" " + segundoFibo);
      control--;
    }
  }
 }
