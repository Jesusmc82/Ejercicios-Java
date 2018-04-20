//package colores;

/**
 * Prueba Ejercicio del Examen de Programación 2015 2016 t3c1_a ejercicio 1
 *
 * @author jesus
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_Colores {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

		HashMap<String, String> colorEspanol = new HashMap<>();
        colorEspanol.put("Azul", "Blue");
        colorEspanol.put("Negro", "Black");
        colorEspanol.put("Rojo", "Red");
        colorEspanol.put("Blanco", "White");
        colorEspanol.put("Verde", "Green");
        colorEspanol.put("Morado", "Purple");
        colorEspanol.put("Amarillo", "Yellow");
        colorEspanol.put("Naranja", "Orange");
        colorEspanol.put("Rosa", "Pink");
		
		HashMap<String, String> colorRgb = new HashMap<>();
        colorRgb.put("Azul", "#0000FF");
        colorRgb.put("Negro", "#000000");
        colorRgb.put("Rojo", "#FF0000");
        colorRgb.put("Blanco", "#FFFFFF");
        colorRgb.put("Verde", "#008000");
        colorRgb.put("Morado", "#800080");
        colorRgb.put("Amarillo", "#FFFF00");
        colorRgb.put("Naranja", "#FFA500");
        colorRgb.put("Rosa", "#EE82EE");
        
        //En el diccionario colorCompleto almacenamos
        //el nombre común en minúscula junto con el nombre
        //original, por ejemplo ("rojo", "Rojo")
        HashMap<String, String> colorCompleto = new HashMap<>();
        for (Map.Entry pareja : colorEspanol.entrySet()) {
            colorCompleto.put((pareja.getKey().toString().toLowerCase()), pareja.getKey().toString());
        }

		//Muestra todos los nombres comunes para que el
		//usuario sepa cuáles están disponibles.
        int contadorColores = 1;

        for (Map.Entry pareja : colorEspanol.entrySet()) {

            if (contadorColores < colorEspanol.size()) {
                System.out.print(pareja.getKey() + ", ");
            } else {
                System.out.print(pareja.getKey() + ("."));
            }

            contadorColores++;
        }

        System.out.println();
        System.out.print("Por favor, introduzca un color: ");
        String colores = s.nextLine().toLowerCase();
        
        if (colorCompleto.containsKey(colores)) {
            System.out.println("El color " + colorCompleto.get(colores) + ", en inglés es " + colorEspanol.get(colorCompleto.get(colores)) + ", " + "y su codigo RGB es " +  colorRgb.get(colorCompleto.get(colores)));
        } else {
            System.out.println("Lo siento, ese color no existe");
        }
    }
}
