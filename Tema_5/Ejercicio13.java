/**
* Escribe un programa que lea una lista de diez números y determine cuántos
* son positivos, y cuántos son negativos.
*
* @author Jesus Martin Castro
*/
public class Ejercicio13{
  public static void main(String[] args) {
    
    System.out.print("Introduzca una seria de 10 números tanto negativos como positivos ");
    System.out.println("yo se los separaré en dos columnas");

      int control = 0;
      int controlDos= 1;
      int numeroPositivo= 0;
      int numeroNegativo= 0;
    
    System.out.printf("\n");
          
      do {
        System.out.print(" " + controlDos + "- Anote el número ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
            
          if (numeroIntroducido >= 0) {
            numeroPositivo++;
          }else{
            numeroNegativo++;
          }
       
        control ++;
        controlDos++;
                   
      } while (control <= 9);
     
    System.out.print("\n");  
    System.out.printf("%10s %30s", "Numero Positivo", "Numero Negativo\n");  
    System.out.printf("%7d %29d",  numeroPositivo, numeroNegativo);
  }
}
