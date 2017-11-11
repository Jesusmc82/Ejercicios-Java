public class EjercicioPiramide2{
  public static void main(String[] args) {
   
    System.out.print("Introduzca una altura para su piramide ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca un caracter con el que quiera dibujar la piramide ");
    String caracter = System.console().readLine();
    int espacio = alturaIntroducida - 1;
    int altura = 1;
    int numCaracteres = 1;
    int espacioInt = 1;
    
    for (int i = 1; i <= espacio; i++) {
      System.out.print(" ");
    }
      
    System.out.print(caracter);
    
    System.out.println();
    
    altura ++;
    
    do {
      
      for (int i = 1; i <= espacio-1; i++) {
        System.out.print(" ");
      }
      
      
      System.out.print(caracter);
      
      
      
      for (int i = 1; i <= espacioInt; i++) {
       System.out.print(" ");
      }
      
      System.out.print(caracter);
      
      
      System.out.println();
     
     altura++;
     espacio--;
     espacioInt += 2;
     numCaracteres+= 2;
  
    }while (altura <= alturaIntroducida-1);
    
    for (int i = 1; i <= numCaracteres+2; i++) {
        System.out.print(caracter);
    }
  }
}
