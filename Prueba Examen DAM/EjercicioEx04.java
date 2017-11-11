/**
* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
* encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
* el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
* Ejemplo 1:
* Introduzca un número entero (mayor que cero): 51803458
* Después de haber sido comido por el gusano numérico se queda en 51345
* Ejemplo 2:
* Introduzca un número entero (mayor que cero): 29614
* El gusano numérico no se ha comido ningún dígito.
*
* @author Jesus Martin Castro
*/
public class EjercicioEx04{
  public static void main(String[] args) {

    System.out.print("Introduzca un número entero (mayor que cero): ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numeroNuevo = 0;
    int aux = 0;
    int numeroNormal = 0;
    boolean esNormal = false;
    
    while (numeroIntroducido >= 1) {//hacemos bucle para primero darle la vuelta al número
      
      if ((numeroIntroducido % 10 == 0) || (numeroIntroducido % 10 == 8)) { //con este condicional le decimos al número que si hay algún digito que sea 0 u 8 los quite, que el resto de números continúe el proceso normal
        numeroIntroducido /= 10;
        esNormal = true; //el boolean procuramos comprobar si en el número introducido tiene 0 u 8
      } else {
        numeroNuevo += numeroIntroducido % 10;
        numeroNuevo *= 10;
        numeroIntroducido /= 10;
      }
    }    
     
    while (numeroNuevo >= 1) { // con este bucle, ya con los 0 y 8 eliminados, volvemos el número entero a su estado normal.
        aux += numeroNuevo % 10;
        aux *= 10;
        numeroNuevo /= 10;
    }

      aux = aux/10;
    
    if (esNormal== true) {
      System.out.print("Después de haber sido comido por el gusano numérico se queda en: " + aux); // imprime el número sin 0 y 8
    
    } else {
      System.out.print("El gusano numérico no se ha comido ningún dígito: " + aux); //imprime el número introducido igual dado que no se intrudujo ningún 0 u 8
    }
  }
}
