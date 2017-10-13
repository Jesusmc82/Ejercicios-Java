/**
* Escribe un programa que muestre por pantalla 10 palabras en inglés junto
* a su correspondiente traducción al castellano. Las palabras deben estar
* distribuidas en dos columnas y alineadas a la izquierda
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 { // Clase principal
    public static void main(String[] args) {
        System.out.println("Estas palabras son en Inglés con su traducción en Español");        
        System.out.printf("%5s %15s", "Inglés", "Español\n");
        System.out.println("_____________________");
        System.out.printf("%5s %11s", "Beautiful", "Bonito\n");
        System.out.printf("%1s %16s", "Fat", "Gordo\n");
        System.out.printf("%5s %14s", "Triunfo", "Triumph\n");
        System.out.printf("%5s %14s", "Operation", "Operación\n");
        System.out.printf("%3s %16s", "Dog", "Perro\n");
        System.out.printf("%4s %14s", "Home", "Casa\n");
        System.out.printf("%2s %15s", "Red", "Rojo\n");
        System.out.printf("%5s %14s", "Traslator", "Traductor\n");
        System.out.printf("%5s %12s", "Ginger hair", "Pelirrojo\n");
        
    }
}
