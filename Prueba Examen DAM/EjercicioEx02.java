/**
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
* ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
* bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
* precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
* IVA ya está incluido en todas las tarifas.
* Ejemplo:
* Introduzca la altura de la bandera en cm: 20
* Ahora introduzca la anchura: 35
* ¿Quiere escudo bordado? (s/n): n
* Gracias. Aquí tiene el desglose de su compra.
* Bandera de 700 cm2: 7.00 €
* Sin escudo:
* 0.00 €
* Gastos de envío:
* 3.25 €
* Total:
* 10.25 €
*
* @author Jesus Martin Castro
*/
public class EjercicioEx02{
  public static void main(String[] args) {
    
    System.out.println("Somos la empresa BanderaDeEspaña.es vamos a calcularle el precio de su bandera");
    System.out.println("Le recordamos que el IVA está incluido en los precios");
    System.out.println("(Pulso INTRO para comenzar)");
    String linea = System.console().readLine();
    System.out.print("Díga el ancho de su bandera (en cm): ");
    int ancho = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora diga el alto de su bandera (en cm): ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("¿Desea que su bandera tenga escudo bordado? (si/no): ");
    String bordado = System.console().readLine().toLowerCase();
    
    double bordadoPrecio = 0;
    double centimetroCuadrado = 0.01;
    double tamaño = 0;
    double valor = 0;
    double precioTotal = 0;
    double gastoEnvio = 3.25;
      
      if (bordado.equals("si")) { //condicional para saber si el usuario desea escudo bordado o no.
         bordadoPrecio = 2.50;
      } else if (bordado.equals("no")) {
          bordadoPrecio = 0;
      } else {
        System.out.println("Esa opción no es valida");
      }
          
          
    tamaño = ancho * alto; //calculamos el área de la bandera.
    
    valor = tamaño * centimetroCuadrado; // ahora calculamos el precio de la bandera a razón de 0.01 centimo/cm².
    
    precioTotal = valor + bordadoPrecio + gastoEnvio; //aquí tenemos el precio de la bandera en total.
    
    System.out.println();
    System.out.println("Estos son los datos que ud. nos ha dado:");
    System.out.println("El alto que desea para su bandera es: " + alto + " cm");
    System.out.println("El ancho de su bandera será: " + ancho + " cm");
    System.out.println("Escudo bordado: " + bordado);
    System.out.println();
    System.out.println("El tamaño total de su bandera en cm² es: " + tamaño + " cm²");
    System.out.println("El precio de su bandera a razón de 0.01 centimo/cm² es: " + valor + " €");
    System.out.println();
    System.out.println("Los gastos de envío son: " + gastoEnvio + " €");
    System.out.println("El precio de su bandera será: " + precioTotal + " €");
        
  }
}
