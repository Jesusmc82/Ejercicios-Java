/**
* Escribe un programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
*
* @author Jesus Martin Castro
*/
public class Ejercicio1 {
    public static void main(String[] args) {
      System.out.println("No sabes qué asignatura toca a primera hora, ¡¡yo te ayudaré!!");
        String Linea= System.console().readLine();
      System.out.println("¿Qué día es hoy?");
        String diaSemana = System.console().readLine().toLowerCase();//pasa la variable toda a minúscula, si ponemos toUpperCase pasaría todo el texto introducido a mayúsculas.
        
        if (diaSemana.equals("lunes")) {
            System.out.println("Sistemas Informáticos");
        } else if (diaSemana.equals("martes")){
            System.out.println("Programación");
        }else if (diaSemana.equals("miercoles")) {
            System.out.println("Sistemas Informáticos");
        } else if (diaSemana.equals("jueves")){
            System.out.println("Programación");
        } else if (diaSemana.equals("viernes")){
            System.out.println("Programación");
        } else {
            System.out.println("Ese día no hay clases");//al meter por la variable el día en concreto lee todas estás opciones y mostrará la asignatura en el día en concreto, si no fuese cualquiera de estos días, saltaría el mensaje del final.
        }
    }
}
