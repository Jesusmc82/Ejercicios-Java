package ejercicio4;
/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * @author jesus
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        ArrayList<String> palabra = new ArrayList<>();
        
        System.out.print("Por favor, introduzca 10 palabras: ");
        for(int i = 1; i <= 10; i ++) { 
            String x = s.next();
            palabra.add(x);
        }
        
        Collections.sort(palabra);
        
        System.out.println(palabra);
    }
    
}
