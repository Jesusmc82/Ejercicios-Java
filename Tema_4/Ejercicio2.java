/**
* Realiza un programa que pida una hora por teclado y que muestre luego
* buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
* tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
* cuenta las horas, los minutos no se deben introducir por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio2 {
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
