package ejercicioexamen;

/**
 * Prueba Ejercicio del Examen de Programación 2015 2016 t3c1_b ejercicio 4
 *
 * @author jesus
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioExamen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> plantaCientifica = new HashMap<>();
        HashMap<String, String> plantaPropiedades = new HashMap<>();
        HashMap<String, String> plantaMinuscula = new HashMap<>();
        String plantaReferencia;

        plantaCientifica.put("Ortiga", "Urtica dioica");
        plantaCientifica.put("Romero", "Rosmarinus officinalis");
        plantaCientifica.put("Aloe Vera", "Aloe barbadensis miller");
        plantaCientifica.put("Ayahuasca", "Banisteriopsis caapi");

        plantaPropiedades.put("Ortiga", "Propiedades 1");
        plantaPropiedades.put("Romero", "Propiedades 2");
        plantaPropiedades.put("Aloe Vera", "Propiedades 3");
        plantaPropiedades.put("Ayahuasca", "Propiedades 4");

        for (Map.Entry pareja : plantaPropiedades.entrySet()) {
            plantaMinuscula.put((pareja.getKey().toString().toLowerCase()), pareja.getKey().toString());
        }

        int contador = 1;

        for (Map.Entry pareja : plantaCientifica.entrySet()) {

            if (contador < plantaCientifica.size()) {
                System.out.print(pareja.getKey() + ", ");
            } else {
                System.out.print(pareja.getKey());
            }

            contador++;
        }

        System.out.println();
        System.out.print("Por favor, introduzca el nombre de una planta: ");
        plantaReferencia = s.nextLine().toLowerCase();
        System.out.println();

        if (plantaMinuscula.containsKey(plantaReferencia)) {
            System.out.println("Nombre común: " + plantaMinuscula.get(plantaReferencia));
            System.out.println("Nombre científico: " + plantaCientifica.get(plantaMinuscula.get(plantaReferencia)));
            System.out.println("Propiedades: " + plantaPropiedades.get(plantaMinuscula.get(plantaReferencia)));
        } else {
            System.out.println("Lo siento, esa planta no existe");
        }
    }
}
