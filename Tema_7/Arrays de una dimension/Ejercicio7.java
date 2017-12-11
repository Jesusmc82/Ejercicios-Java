/**
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces
* por teclado dos valores y a continuación cambiará todas las ocurrencias del
* primer valor por el segundo en la lista generada anteriormente. Los números
* que se han cambiado deben aparecer entrecomillados.
*
* @author Jesus Martin Castro
*/
public class Ejercicio7 {
  public static void main(String[] args){
    
    int[] numero = new int[100];
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()* 20);
      System.out.print(" " + numero[i]);
    }
    
    System.out.println();
    System.out.print("¿Qué número del listado desea sustituir? ");
    int numeroElegido = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Por qué número desea sustituirlo? ");
    int numeroSustituir = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    for(int i = 0; i < numero.length; i++) {
      if (numero[i] == numeroElegido) {
        numero[i] = numeroSustituir;
        System.out.print(" '" + numero[i] + "'");
      } else {
        System.out.print(" " + numero[i]);
      }
    }
  }
}
