/**
* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
* diente nombre del día de la semana.
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 {
    public static void main(String[] args) {
      System.out.print("¿Qué hora es? ");
        int hora = Integer.parseInt (System.console().readLine());//Pedimos la hora y la metemos en esta variable
        
        if ((hora >=6) && (hora <=12)) { // Con esta sentencia le decimos que si la hora introducida está entre ese rango, nos de los buenos días.
            System.out.println("Buenos días");
        } else if ((hora >=13) && (hora<= 20)){ // Con esta otra sentencia la dedicamos a dar las buenas tardes
            System.out.println("Buenas tardes");
        }else if ((hora >=21) && (hora<= 24)){ // Para las buenas noches hemos creado dos posibilidades, dado que el rango de horas que se da no es consecutivo entre si, de ahí que tengamos esta primera que va desde las 21 hasta las 24
            System.out.println("Buenas noches");
        }else if ((hora >=00) && (hora<= 5)){
            System.out.println("Buenas noches"); // y esta otra que va desde las 00 hasta las 05
        }else {
        }
    }
}
