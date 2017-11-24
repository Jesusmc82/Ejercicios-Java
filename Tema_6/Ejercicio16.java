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
    
    System.out.println("Juguemos a una maquina tragaperras, inserte su moneda.");
    System.out.print("Pulse INTRO cuando inserte su moneda:");
    System.console().readLine();
    String figuraUno = "";
    String figuraDos = "";
    String figuraTres = "";
    String figuras = "";
      
    for(int i = 1; i <= 3; i++) {
    
      switch((int)(Math.random()* 5) + 1) {
          case 1:
            figuras = " Corazón ";
            break;
          case 2:
            figuras = " Diamante ";
            break;
          case 3:
            figuras = " Herradura ";
            break;
          case 4:
            figuras = " Campana ";
            break;
          case 5:
            figuras =" Limón ";
            break;
        default:
      }
      
      System.out.print(figuras);
        
      if (i == 1) {
        figuraUno = figuras;
      }
      if (i == 2) {
        figuraDos = figuras;
      }
      if (i == 3) {
        figuraTres = figuras;
      }
    }
    
    System.out.println();
    
    if ((figuraUno == figuraDos) && (figuraDos == figuraTres) && (figuraUno == figuraTres)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else if ((figuraUno != figuraDos) && (figuraDos != figuraTres) && (figuraUno != figuraTres)) {
      System.out.println("Lo siento, ha perdido.");
    } else if ((figuraUno == figuraDos) || (figuraDos == figuraTres) || (figuraUno == figuraTres)) {
      System.out.println("Bien, ha recuperado su moneda.");
    } else {
    }
  }
}
