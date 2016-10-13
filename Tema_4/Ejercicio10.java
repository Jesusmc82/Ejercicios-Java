/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Jesus Martin Castro
 */
public class Ejercicio10 {
 
 public static void main(String[] args) {
  
    System.out.println("Le voy a decir cual es su signo del zoodiaco");
  
    System.out.print("¿En qué día nació?: ");
    int dia = Integer.parseInt(System.console().readLine());
   
    System.out.print("¿De qué mes?: ");
    String mes = System.console().readLine().toLowerCase();
    
   
    switch (mes) {
      case "enero":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Acuario");
      }else{
        System.out.println("Su horoscopo es: Capricornio");
      }
      break;
      
      case "febrero":
      if ((dia > 29 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Piscis");
      }else{
        System.out.println("Su horoscopo es: Acuario");
      }
      break;
      
      case "marzo":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Aries");
      }else{
        System.out.println("Su horoscopo es: Piscis");
      }
      break;
      
      case "abril":
      if ((dia > 30 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Tauro");
      }else{
        System.out.println("Su horoscopo es: Aries");
      }
      break;
      
      case "mayo":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Geminis");
      }else{
        System.out.println("Su horoscopo es: Tauro");
      }
      break;
      
      case "junio":
      if ((dia > 30 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Cancer");
      }else{
        System.out.println("Su horoscopo es: Geminis");
      }
      break;
      
      case "julio":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Leo");
      }else{
        System.out.println("Su horoscopo es: Cancer");
      }
      break;
      
      case "agosto":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Virgo");
      }else{
        System.out.println("Su horoscopo es: Leo");
      }
      break;
      
      case "septiembre":
      if ((dia > 30 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Libra");
      }else{
        System.out.println("Su horoscopo es: Virgo");
      }
      break;
      
      case "octubre":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Escorpio");
      }else{
        System.out.println("Su horoscopo es: Libra");
      }
      break;
      
      case "noviembre":
      if ((dia > 30 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Sagitario");
      }else{
        System.out.println("Su horoscopo es: Escorpio");
      }
      break;
      
      case "diciembre":
      if ((dia > 31 ) || (dia <= 0 )){
      System.out.println("Por favor introduzca un dia correcto");
      } else if (dia >= 21){
       System.out.println("Su horoscopo es: Capricornio");
      }else{
        System.out.println("Su horoscopo es: Sagitario");
      }
      break;
   }
  }
 }
