/**
* Escribe un programa que muestre los n primeros términos de la serie de
* Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
* y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
* los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
* debe introducir por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio12{
  public static void main(String[] args) {
    
    System.out.println("Voy a enseñarle la serie Fibonacci en la cantidad de números que desee.");
    System.out.print("Introduzca ahora esa cantidad: ");
      int cantidad = Integer.parseInt(System.console().readLine());
    
      int control = 0;
      int numeroUno= 0;
      int numeroDos= 1;
      int numeroFibo= 0;
    
    System.out.print("\n");
    
      if(cantidad == 0) {
          
        System.out.print(" ");
          
      }else{  
          
          do {
            
            numeroUno = numeroDos;
            numeroDos = numeroFibo;
            
            System.out.print(" " + numeroFibo);
            
            numeroFibo = numeroUno + numeroDos;
            control ++;
            
          } while (control <= cantidad - 1);    
      }
  }
}
