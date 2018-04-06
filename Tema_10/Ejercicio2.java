package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 *
 * @author jesus
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        int i = (int) ((Math.random() * 11) + 10);
        int numeroSuma = 0;
        int numeroMedia = 0;
        int control = 0;
        int numeroMayor =  Integer.MIN_VALUE;
        int numeroMenor =  Integer.MAX_VALUE;

        for (int x = 1; x <= i; x++) {
            
            int n = ((int) (Math.random() * 100));
            numeros.add(n);
            numeroSuma = numeroSuma + n;
            if (numeroMayor < n) {
                numeroMayor = n;
            }
            if (numeroMenor  > n) {
                numeroMenor = n;
            }
            
        }

        System.out.print("Los números sacados son:");
        for(int a: numeros) {
            System.out.print(" " + a + ",");
        }
        
        System.out.println();
        System.out.println("La suma de todos los números es: " + numeroSuma);
        System.out.println("La media de la suma de todos es: " + ((double)numeroSuma/(double)i));
        System.out.println("El mayor de todos los números es: " + numeroMayor);
        System.out.println("El menor de todos los números es: " + numeroMenor);
    }
}
