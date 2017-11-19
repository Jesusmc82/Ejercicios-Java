/**
* 
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Diez números aleatorios:\n");
  
    int columnas = 3;
    
    int quiniela = (int)(Math.random()*3) + 1;
      
      for (int i = 1; i<= 15; i ++) {
        
        switch(quiniela) {
          case 0:
            System.out.println("1");
          break;
            
          case 1:
            System.out.println("X");
          break;
        
          case 3:
            System.out.println("2");
          break;
        
        default:
        }
        
      System.out.println();
      }
  }
}
