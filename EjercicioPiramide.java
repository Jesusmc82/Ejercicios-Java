public class EjercicioPiramide{
  public static void main(String[] args) {
   
    System.out.print("Introduzca una altura para su piramide ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca un caracter con el que quiera dibujar la piramide ");
    String caracter = System.console().readLine();
    int espacio = alturaIntroducida - 1;
    int altura = 1;
    int numCaracteres = 1;
   
    do {
      
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= numCaracteres; j++) {
        System.out.print(caracter);
      }
      
     
     System.out.println();
     
     altura++;
     espacio--;
     numCaracteres+=2;
  
    }while (altura <= alturaIntroducida);
  }
}
