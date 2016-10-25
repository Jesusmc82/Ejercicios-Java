/**
* 
* Escribe un programa que genere la nómina (bien desglosada) de un empleado
* según las siguientes condiciones:
* • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
* - Jefe de proyecto), los días que ha estado de viaje visitando clientes
* durante el mes y su estado civil (1 - Soltero, 2 - Casado).
* • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
* si se trata de un prog. junior, un prog. senior o un jefe de proyecto
* respectivamente.
* • Por cada día de viaje visitando clientes se pagan 30 euros extra en
* concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
*  de un 25% en caso de estar soltero y un 20% en caso de estar casado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio24 {
  public static void main(String[] args) {
  
    System.out.println("¿Calculamos su nómina? Siga las instrucciones");
    System.out.println("Cargo:");
    System.out.println("1- Programador junior.");
    System.out.println("2- Programador senior.");
    System.out.println("3- Jefe de proyecto.");
    System.out.print("Opción: ");
    int opcion1 = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
    
    switch (opcion1) {
      
      case 1:
        sueldoBase = 950;
      break;
      
      case 2:
        sueldoBase = 1200;
      break;
      
      case 3:
        sueldoBase = 1600;
      break;
    }
        
    System.out.print("¿Ha realizado alguna visita a clientes?: ");
    int dias = Integer.parseInt(System.console().readLine());
    double dietas = dias * 30;
    
    if (dias < 0) {
      System.out.print("Introduzca los días correctos");
    } else {
    
      System.out.println("Estado civil:");
      System.out.println("1- Soltero.");
      System.out.println("2- Casado.");
      System.out.print("Opción: ");
      int opcion2 = Integer.parseInt(System.console().readLine());
      
      double irpfAplicado = 0;
      int irpf = 0;
      
      switch (opcion2) {
        
        case 1:
        irpf = 25;
        irpfAplicado = ((sueldoBase + dietas) * 0.25);
        break;
        
        case 2:
        irpfAplicado = ((sueldoBase + dietas) * 0.2);
        irpf = 20;
        break;
      
    }
      System.out.println("Ya tenemos su nómina");
      System.out.printf("\n# Sueldo base: %18.2f€ #", sueldoBase);
      System.out.printf("\n# Dietas (" + dias + " viajes): %12.2f€ #", dietas);
      System.out.print("\n####################################");
      System.out.printf("\n# Sueldo bruto: %17.2f€ #", (sueldoBase + dietas));
      System.out.printf("\n# Retención IRPF (" + irpf + "%%): %9.2f€ #", irpfAplicado);
      System.out.print("\n####################################");
      System.out.printf("\n# Sueldo neto: %18.2f€ #", ((sueldoBase + dietas) - irpfAplicado));
      System.out.print("\n####################################");
    }
  }
}
