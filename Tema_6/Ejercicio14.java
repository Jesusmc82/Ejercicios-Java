/**
* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
* El programa intentará adivinar el número que estás pensando - un número
* entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o menor
* que el que te acaba de decir.
*
* @author Jesus Martin Castro
*/
public class Ejercicio14 {
  public static void main(String[] args){
    
    System.out.println("Piensa un número entre entre 0 y 100, yo procuraré adivinarlo.");
    System.out.print("Empecemos:");
    String salto = System.console().readLine();
    
    int numeroAdivinar = 0;
    int numeroAcertado = 0;
    int contador = 5;
    boolean acertado = false;
    String acierto = "";
    String reCalculo = "";
    int numeroMaximo = 100;
    int numeroMinimo = 0;
   
    do {
      
      System.out.println();
      numeroAdivinar = (int)(Math.random()*(numeroMaximo - numeroMinimo) + numeroMinimo);
      
      System.out.println("- ¿es este su número? " + numeroAdivinar);
      System.out.printf("%8.2s %1.2s %2.2s %1.2s", "Si", "o", "no", ": ");
      acierto = System.console().readLine().toLowerCase();
      
      if (acierto.equals("no")) {
        System.out.printf("%6.1s %1.18s", "¿", "es mayor o menor? ");
        reCalculo = System.console().readLine().toLowerCase();
        contador --;
        
        if (reCalculo.equals("menor")) {
          numeroMaximo = numeroAdivinar - 1;

        } else if (reCalculo.equals("mayor")) {
          numeroMinimo = numeroAdivinar + 1;
        }
         
      } else if (acierto.equals("si")) {
          acertado = true;
          System.out.println("¡¡ESTUPENDO HE ACERTADO!!");
      }
      
    } while ((!acertado) && (contador>=1));
    
    if (!acertado) {
        System.out.println();
        System.out.println("Vaya no pude acertar su número");
    }
  }
}
