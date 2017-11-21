/**
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto. 
*
* @author Jesus Martin Castro
*/
public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Voy a pensar un número y ud. tendrá 5 oportunidades para averigüarlo.");
    System.out.println("Empecemos:");
    
    int numeroPensado = (int)(Math.random()*100);;
    int numeroInsertado = 0;
    int contador = 5;
    boolean acertado = false;
   
    do {
      
      System.out.print("Introduzca su número: ");
      numeroInsertado = Integer.parseInt(System.console().readLine());
      
        contador --;
        
      if ((numeroInsertado < numeroPensado) && (contador > 0)) {
        System.out.println("Lo siento, no ha acertado, le quedan " + contador + " oportunidades");
        System.out.println("El número pensado es mayor al número insertado");
      }
      
      if  ((numeroInsertado > numeroPensado) && (contador > 0)) {
        System.out.println("Lo siento, no ha acertado, le quedan " + contador + " oportunidades");
        System.out.println("El número pensado es menor al número insertado");
      }
      
      if (numeroInsertado == numeroPensado) {
        acertado = true;
        System.out.println("¡¡FELICIDADES HA ACERTADO!!");
      }
    
    } while ((numeroInsertado != numeroPensado) && (contador>=1));
    
    if (!acertado) {
        System.out.println("Ya acabaron sus oportunidades");
        System.out.println("El número pensado era: " + numeroPensado);
    }
  }
}
