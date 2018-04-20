package ejercicio6;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
 * nombres de usuario con sus correspondientes contraseñas deben estar
 * almacenados en una estructura de la clase HashMap.
 *
 * @author jesus
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> usuarioContrasena = new HashMap<>();
        String usuario;
        int contrasena;
        int contador = 1;

        usuarioContrasena.put("Pepe", 0000);
        usuarioContrasena.put("Antonio", 5678);
        usuarioContrasena.put("Rosa", 1234);

        System.out.println();
        System.out.print("Por favor, introduzca un usuario: ");
        usuario = s.nextLine();
        System.out.println();
        System.out.print("Introduzca su contraseña: ");
        contrasena = Integer.parseInt(s.nextLine());
        System.out.println();

        if (usuarioContrasena.containsKey(usuario)) {
            /*if(contrasena(usuarioContrasena.get(contrasena))){
                System.out.println("Este usuario existe");
            } else {
            System.out.println("Este usuario no existe");
            
        } */
            System.out.println(usuarioContrasena.get(contrasena));
        }
    }
}
