/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 * @author Jesus Martin Castro 
*/ 
//package ejercicio2;
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("vamos a mostrarle los números multiplos de 5 desde el 0 al 100:");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 5;
        }
    }
}
