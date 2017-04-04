/**
 *
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio10_1{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Si me dice su día y mes de nacimiento, le diré cuál es su horoscopo");
     
     System.out.print("\n¿En qué día nació?: ");
      int dia = Integer.parseInt(System.console().readLine());
      
     System.out.print("Ahora indique su mes de nacimiento: ");
     String mes = n.nextLine().toLowerCase();
             
     switch (mes) {
      case "diciembre":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Sagitario");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Capricornio");
      }
      break;

      case "enero":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Capricornio");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Acuario");
      }
      break;
      
      case "febrero":
        if((dia>=1)&&(dia<=19)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Acuario");
        }else if ((dia>=20)&&(dia<=29)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Piscis");
      }
      break;
     
     case "marzo":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Piscis");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Aries");
      }
      break;
     
     case "abril":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Aries");
        }else if ((dia>=21)&&(dia<=30)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Tauro");
      }
      break;
      
      case "mayo":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Tauro");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Geminis");
      }
      break;
      
      case "junio":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Geminis");
        }else if ((dia>=21)&&(dia<=30)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Cancer");
      }
      break;
      
      case "julio":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Cancer");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Leo");
      }
      break;
      
      case "agosto":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Leo");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Virgo");
      }
      break;
      
      case "septiembre":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Virgo");
        }else if ((dia>=21)&&(dia<=30)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Libra");
      }
      break;
      
      case "octubre":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Libra");
        }else if ((dia>=21)&&(dia<=31)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Escorpio");
      }
      break;
      
      case "noviembre":
        if((dia>=1)&&(dia<=20)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Escorpio");
        }else if ((dia>=21)&&(dia<=30)){
          System.out.println("\nEl " + dia + " de " + mes + " el signo que corresponde es Sagitario");
      }
      break;
      
     default:
    }
  }
}
