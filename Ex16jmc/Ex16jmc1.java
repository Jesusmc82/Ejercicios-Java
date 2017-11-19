/**
* La compañía automovilística Ñesla nos ha encargado un configurador para calcular el precio de su
* coche eléctrico. Los dos modelos que tiene a la venta son el Ñesla Modelo 5 y el Ñesla Modelo 8,
* que tienen un precio base de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
* con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir con 80 kWh o con 120
* kWh. En todos los casos, cada kWh de batería se paga a 125 €. El Modelo 8 (solo este modelo) se
* puede encargar con el paquete de conducción autónoma, que cuesta 1800 €. Todos los coches
* eléctricos cuentan con una subvención del gobierno del 5% del precio final del vehículo. No hay que
* considerar el IVA, ya está incluido en todas las tarifas.
* Ejemplo 1:
* Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: a
* Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: b
* Gracias. Aquí tiene el presupuesto de su coche.
* Ñesla Modelo 5
* Precio base 30000.00 €
* Batería de 70 kWh 8750.00 €
* Subvención estatal -1937.50 €
* Total 36812.50 €
* Ejemplo 2:
* Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: b
* Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: a
* ¿Quiere el paquete de conducción autónoma? (s/n): n
* Gracias. Aquí tiene el presupuesto de su coche.
* Ñesla Modelo 8
* Precio base 36000.00 €
* Batería de 80 kWh 10000.00 €
* Sin conducción aut. 0.00 €
* Subvención estatal -2300.00 €
* Total 43700.00 €
* @author Jesús Martín Castro
*
*/
import java.util.Scanner;

public class Ex16jmc1 {
  public static void main(String[] args) { 
    
    String bateria= ("");
    String conduccion= ("");
    
    System.out.println("Seleccione el modelo de coche: ");
    System.out.println("(a) Modelo 5: ");
    System.out.println("(b) Modelo 8: ");
    System.out.println("(Recuerde que el IVA ya va incluido en el precio)");
    String coche= System.console().readLine().toLowerCase();
    
    if (coche.equals("a")) {
    System.out.println("Seleccione el tipo de batería");
    System.out.println("(a) 50 kWh");
    System.out.println("(b) 70 kWh:");
    bateria= System.console().readLine().toLowerCase();
    } else if (coche.equals("b")) {
    System.out.println("Seleccione el tipo de batería");
    System.out.println("(a) 80 kWh");
    System.out.println("(b) 120 kWh:");
    bateria= System.console().readLine().toLowerCase();
    System.out.println("¿Quiere el paquete de conducción autónoma? (si/no): ");
    conduccion= System.console().readLine().toLowerCase();
    }
    
    
    double cochePrecio= 0;
    double bateriaPrecio= 0;
    double conduccionPrecio = 0;
    
    System.out.println("Gracias. Aquí tiene el presupuesto de su coche.");
    
    if(coche.equals("a")) {
        System.out.println("Ñesla Modelo 5");
        cochePrecio= 30000;
        System.out.println("Precio base: " + cochePrecio + " €");
      if(bateria.equals("a")) {
        bateriaPrecio= 50 * 125;
        System.out.println("Batería de 50 kWh " + bateriaPrecio + " €");
      } else if(bateria.equals("b")) {
        bateriaPrecio= 70 * 125;
        System.out.println("Batería de 70 kWh " + bateriaPrecio + " €");
      }
    }
    
    if(coche.equals("b")) {
        System.out.println("Ñesla Modelo 8");
        cochePrecio= 36000;
        System.out.println("Precio base: " + cochePrecio + " €");
      if(bateria.equals("a")) {
        bateriaPrecio= 80 * 125;
        System.out.println("Batería de 80 kWh " + bateriaPrecio + " €");
      } else if(bateria.equals("b")) {
        bateriaPrecio= 120 * 125;
        System.out.println("Batería de 120 kWh " + bateriaPrecio + " €");
      }
      
      if(conduccion.equals("no")) {
        conduccionPrecio= 0.00;
        System.out.println("Sin conducción aut. " + conduccionPrecio + " €");
      } else if(conduccion.equals("si")) {
        conduccionPrecio= 1800;
        System.out.println("Con conducción aut. " + conduccionPrecio + " €");
      }
    }
    
    double precioTotal = cochePrecio + bateriaPrecio + conduccionPrecio;
    double subvencion = (precioTotal * 5 / 100);
    System.out.println("Subvención estatal: -" + subvencion + " €");
    double precioFinal = precioTotal - subvencion;
    System.out.println("Total: " + precioFinal + " €");
  }
}
