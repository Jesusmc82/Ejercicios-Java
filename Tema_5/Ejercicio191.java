/**
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio191{
  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide, puede elegir la altura ");
    System.out.println("y el caracter con el que dibujar la pirámide.");
    
    System.out.print("Elija ahora la altura de su pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora puede elegir el caracter con el cuál dibujar la pirámide: ");
    String caracter = System.console().readLine();
    
    System.out.println();
    
    int espacios = alturaIntroducida - 1;
    int altura = 1;
    int numCarac = 1;
    int controlEsp = 0;
    int controlCarac= 0;
    
    do {
      
      while (controlEsp <= espacios) {
        System.out.print(" ");
        controlEsp++;
      }
      
      while (controlCarac < numCarac) {
        System.out.print(caracter);
        controlCarac++;
      }
      
      System.out.println();
      espacios--;
      numCarac+= 2;
      altura++;
      controlEsp = 0;
      controlCarac = 0;
    } while (altura <= alturaIntroducida);   
  }
}
