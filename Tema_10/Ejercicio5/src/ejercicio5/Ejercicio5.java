package ejercicio5;

/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta
 * vez una lista para almacenar la información sobre los discos en lugar de un
 * array convencional. Comprobarás que el código se simplifica notablemente
 * ¿Cuánto ocupa el programa original hecho con un array? ¿Cuánto ocupa este
 * nuevo programa hecho con una lista?
 *
 * @author jesus
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Disco> discoStu = new ArrayList<>();
        int opcion;
        String codigoEliminar;
        String nuevoCodigo;
        String nuevoTitulo;
        String nuevoAutor;
        String codigoModificar;
        String modificarCodigo;
        String modificarTitulo;
        String modificarAutor;
        
        discoStu.add(new Disco("codigo1", "Rosa", "Jesus"));
        discoStu.add(new Disco("codigo2", "Tulipan", "German"));

        do {
            System.out.println("Menú de Discos:");
            System.out.println("1.- Lista");
            System.out.println("2.- Nuevo Disco");
            System.out.println("3.- Modificar Disco");
            System.out.println("4.- Eliminar Disco");
            System.out.println("5.- Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    for (Disco impresion : discoStu) {
                        System.out.println(impresion);
                    }
                    break;
                case 2:
                    System.out.print("Introduzca el nuevo disco: ");
                    System.out.print("Introduzca el nuevo código: ");
                    nuevoCodigo = s.nextLine();
                    System.out.print("Introduzca el nuevo titulo: ");
                    nuevoTitulo = s.nextLine();
                    System.out.print("Introduzca el nuevo autor: ");
                    nuevoAutor = s.nextLine();
                    discoStu.add(new Disco(nuevoCodigo, nuevoTitulo, nuevoAutor));
                    
                    for (Disco impresion : discoStu) {
                        System.out.println(impresion);
                    }

                    break;
                case 3:
                    for (Disco impresion : discoStu) {
                        System.out.println(impresion);
                    }
                    System.out.println("Introduzca el código del disco a modificar: ");
                    codigoModificar = s.nextLine();
                    int indiceModificar = discoStu.indexOf(new Disco (codigoModificar));
                    System.out.print("Introduzca el nuevo codigo: ");
                    modificarCodigo = s.nextLine();
                    System.out.print("Introduzca el nuevo titulo: ");
                    modificarTitulo = s.nextLine();
                    System.out.print("Introduzca el nuevo autor: ");
                    modificarAutor = s.nextLine();
                    discoStu.remove(indiceModificar);
                    discoStu.add(new Disco(modificarCodigo, modificarTitulo, modificarAutor));
                    break;
                case 4:
                    for (Disco impresion : discoStu) {
                        System.out.println(impresion);
                    }
                    System.out.print("Introduzca el código del disco a eliminar: ");
                    codigoEliminar = s.nextLine();
                    discoStu.remove(new Disco(codigoEliminar));

                    break;
            }
        } while (opcion != 5);

    }

}
