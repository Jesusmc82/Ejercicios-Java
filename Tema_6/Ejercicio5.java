/**
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
*
* @author Jesus Martin Castro
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.print("Le mostraré 50 números de manera aleatoria entre el 100 y el 199");
    System.out.println(" le mostraré la suma, la media, el número mínimo y máximo de los números impresos por pantalla:");
    String salto = System.console().readLine();
    
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    double suma = 0;
    int numerosAleatorios = 0;
    int contador = 0;
    
    for (int j = 1; j <= 50; j++) {
      numerosAleatorios = (int)(Math.random()*100) + 100;
      System.out.print(" " + numerosAleatorios);
      suma = suma + numerosAleatorios;
          
        if (numerosAleatorios > numMax) { 
            numMax = numerosAleatorios;
        } 
        if (numerosAleatorios < numMin) {
            numMin = numerosAleatorios;
        }
      contador ++;
    }
    
    System.out.println();
    double media = suma / contador;
    System.out.println();
    System.out.println("Maximo: " + numMax);
    System.out.println("Minimo: " + numMin);
    System.out.println("Suma: " + suma);
    System.out.println("Cantidad números introducidos: " + contador);
    System.out.println("" + suma +" / " + contador + " = " + media + " media de los números impresos");
  }
}
