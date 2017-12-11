/**
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
* de un determinado año y que muestre a continuación un diagrama de barras
* horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
* de asteriscos o cualquier otro carácter.
*
* @author Jesus Martin Castro
*/
public class Ejercicio8 {
  public static void main(String[] args){
    
    String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
      "Julio", "Agosto", "Septiembre", "Octubre", "noviembre", "Diciembre"
    };
    
    int[] temperatura = new int[12];
    String azul = "\033[34m";
    String blanco = "\033[37m";
    String rojo = "\033[31m";
    
    for (int i = 0; i < 12; i++) {
      System.out.print("¿Cuál fue la temperatura media del mes " + mes[i] + "? ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < temperatura[i]; j ++) {
        if (temperatura[i] <= 30) {
          System.out.print(azul + "░");
        } else {
          System.out.print(rojo + "░");
        }
      }
      System.out.println(blanco + " " + mes[i] + " " + temperatura[i] + "ºC");
    }
  }
}
