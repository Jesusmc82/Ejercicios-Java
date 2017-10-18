/**
* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
* diente nombre del día de la semana.
*
* @author Jesus Martin Castro
*/
public class Ejercicio3 {
    public static void main(String[] args) {
      System.out.print("¿Qué día es? (métalo de manera numérica) ");
        int dia = Integer.parseInt (System.console().readLine());
        
        switch (dia) {
          
          case 1:
            System.out.println("Hoy es Lunes");
            break;
          case 2:
            System.out.println("Hoy es Martes");
            break;
          case 3:
            System.out.println("Hoy es Miércoles");
            break;
          case 4:
            System.out.println("Hoy es Jueves");
            break;
          case 5:
            System.out.println("Hoy es Viernes");
            break;
          case 6:
            System.out.println("Hoy es Sábado");
            break;
          case 7:
            System.out.println("Hoy es Domingo");
            break;
        default:
            System.out.println("Esa opción no exite");
      }
    }
}
