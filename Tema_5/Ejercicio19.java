/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 *
 * @Jesus Martin Castro
 */
  public class Ejercicio19 {
  public static void main(String[] args) {

    System.out.println("Dibujemos una pirámide");
    System.out.print("Diga la altura que desea tenga la pirámide: ");
    int altura= Integer.parseInt(System.console().readLine());
    System.out.println("Ahora diga con que caracter desea dibujar la pirámide");
    System.out.println("(recuerde que puede ser @, *, /, a, b, ....) ");
    String caracter= System.console().readLine();
    
    int piso= 1;
    int i= 0;
    int espacios= altura - 1; 
   
    while(piso<=altura){
      
      for (i= 1; i<=espacios; i++){
       System.out.print(" ");
      }
      for (i= 1; i< piso*2; i++){
       System.out.print(caracter);
      }

    
    System.out.println();
    
    piso++;
    espacios--;
    }
  }
}
