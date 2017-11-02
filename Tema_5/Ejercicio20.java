public class Ejercicio20{
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
    int controlCarac = 0;
    int espaciosInt = 1;
    int controlEspInt = 0;
    
    do {
      
      while (controlEsp < espacios) {
        System.out.print(" ");
        controlEsp++;
      }
      
      System.out.print(caracter);
      
      if(altura > 1) {
        while (controlEspInt < espaciosInt) {
          System.out.print(" ");
          controlEspInt++;
        }
        controlEspInt= 0;
        espaciosInt+= 2;
        System.out.print(caracter);
      } else {
        
      }
      
      System.out.println();
      espacios--;
      numCarac+= 2;
      altura++;
      controlEsp = 0;
      controlCarac = 0;
    } while (altura < alturaIntroducida);  
    
    for (int i = 0; i< numCarac; i ++) {
      System.out.print(caracter);
    }
  }
}
