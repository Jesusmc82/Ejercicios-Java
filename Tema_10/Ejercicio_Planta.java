//package planta;

/**
 * Prueba Ejercicio del Examen de Programación 2015 2016 t3c1_b ejercicio 4
 *
 * @author jesus
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_Planta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
		HashMap<String, String> plantaCientifica = new HashMap<>();
        plantaCientifica.put("Ortiga", "Urtica dioica");
        plantaCientifica.put("Romero", "Rosmarinus officinalis");
        plantaCientifica.put("Aloe Vera", "Aloe barbadensis miller");
        plantaCientifica.put("Ayahuasca", "Banisteriopsis caapi");
		
		HashMap<String, String> plantaPropiedades = new HashMap<>();
        plantaPropiedades.put("Ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
        plantaPropiedades.put("Romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades respiratorias y del aparato digestivo.");
        plantaPropiedades.put("Aloe Vera", "Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
        plantaPropiedades.put("Ayahuasca", "Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");

        
        //En el diccionario plantaMinuscula almacenamos
        //el nombre común en minúscula junto con el nombre
        //original, por ejemplo ("ortiga", "Ortiga")
        HashMap<String, String> plantaMinuscula = new HashMap<>();
        for (Map.Entry pareja : plantaPropiedades.entrySet()) {
            plantaMinuscula.put((pareja.getKey().toString().toLowerCase()), pareja.getKey().toString());
        }

		//Muestra todos los nombres comunes para que el
		//usuario sepa cuáles están disponibles.
        int contadorPlanta = 1;
        for (Map.Entry pareja : plantaCientifica.entrySet()) {

            if (contadorPlanta < plantaCientifica.size()) {
                System.out.print(pareja.getKey() + ", ");
            } else {
                System.out.print(pareja.getKey() + ("."));
            }

            contadorPlanta++;
        }

        System.out.println();
        System.out.print("Por favor, introduzca el nombre de una planta: ");
        String plantaReferencia = s.nextLine().toLowerCase();

        if (plantaMinuscula.containsKey(plantaReferencia)) {
            System.out.println("Nombre común: " + plantaMinuscula.get(plantaReferencia));
            System.out.println("Nombre científico: " + plantaCientifica.get(plantaMinuscula.get(plantaReferencia)));
            System.out.println("Propiedades: " + plantaPropiedades.get(plantaMinuscula.get(plantaReferencia)));
        } else {
            System.out.println("Lo siento, esa planta no existe");
        }
    }
}
