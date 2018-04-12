package ejercicio3;
/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * @author jesus
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        ArrayList<Integer> digito = new ArrayList<>();
        
        System.out.print("Por favor, introduzca 10 números enteros: ");
        for(int i = 1; i <= 10; i ++) { 
            int x = s.nextInt();
            digito.add(x);
        }
        
        Collections.sort(digito);
        
        System.out.println(digito);
    }
    
}
