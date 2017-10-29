/**
* Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte..
*
* @author Jesus Martin Castro
*/
public class Ejercicio7{
  public static void main(String[] args) {
      
    System.out.println("Intentemos abrir esta caja fuerte: ");
    
    for( int oportunidades = 0; oportunidades < 4; oportunidades ++) {
      
      int clave = Integer.parseInt(System.console().readLine());
      
        if (clave == 1234) {
          
          System.out.println("La caja fuerte se ha abierto satisfactoriamente ");
          
          oportunidades = oportunidades + 4;
          
        }else{
    
          System.out.println("Procure introducir de nuevo la clave: ");      
        }
    }
  }
}
