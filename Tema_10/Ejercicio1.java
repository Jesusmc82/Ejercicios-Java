package ejercicio1;

import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 *
 * @author jesus
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>();
        
        nombre.add("Raul");
        nombre.add("Mamen");
        nombre.add("German");
        nombre.add("Lucia");
        nombre.add("Anabel");
        nombre.add("Gonzalo");
        
        System.out.print("Nombre de los 6 compañeros: ");

        for(String clase: nombre) {
            System.out.print(clase + " ");
        }
    }

}
