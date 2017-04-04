/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 *
 * @author Jesus Martin Castro
*/
//package ejercicio4;
public class Ejercicio4 {
    public static void main(String[] args) {
     
        System.out.println("Vamos a mostrar los números del 320 al 160 reduciendo de 20 en 20:");
        
        for(int i= 320; i >= 160; i= i-20){
            System.out.println(i);
        }
    }
    
}
