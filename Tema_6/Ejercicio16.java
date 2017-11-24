/**
* Realiza un simulador de máquina tragaperras simplificada que cumpla los
* siguientes requisitos:
* a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
* figuras posibles: corazón, diamante, herradura, campana y limón.
* b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
* ha perdido”.
* c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
* ha recuperado su moneda”.
* d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
* 10 monedas”.
* Ejemplo 1:
* diamante diamante limón
* Bien, ha recuperado su moneda
* Ejemplo 2:
* herradura campana diamante
* Lo siento, ha perdido
* Ejemplo 3:
* corazón corazón corazón
* Enhorabuena, ha ganado 10 monedas
*
* @author Jesus Martin Castro
*/
public class Ejercicio16 {
  public static void main(String[] args){
    
    System.out.println("Vamos a crear una melodia, con un compás de compasillo (4/4)");
    System.out.print("Pulse INTRO para generar la melodía:");
    String salto = System.console().readLine();
    int compas = (int)(Math.random()* 7) + 1;
    String ultimaNota = "";
    String notaString = "";
    
    for(int j = 0; j <= compas; j++) {
      
      for(int i = 1; i <= 4; i++) {
      
      int nota = (int)(Math.random()* 7) + 1;
      
      switch(nota) {
          case 1:
            notaString = " Do ";
          break;
          case 2:
            notaString = " Re ";
          break;
          case 3:
            notaString =" Mi ";
          break;
          case 4:
            notaString = " Fa ";
          break;
          case 5:
            notaString =" Sol ";
          break;
          case 6:
            notaString = " La ";
          break;
          case 7:
            notaString = " Si ";
          break;
        default:
        }
        
        if ((j == 0) && (i == 1)) {
          ultimaNota = notaString;
        }
        
        if ((j==compas)&&(i==4)) {
          
          System.out.print(ultimaNota);
        } else {
        System.out.print(notaString);
        }
      }
      
      if (j<compas) {
        System.out.print("|");
      } else if (j==compas) {
        System.out.print("||");
      }
    }
  }
}
