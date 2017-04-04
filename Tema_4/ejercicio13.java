/**
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 *
 * @author Jesus Martin Castro
 */
public class ejercicio13 { 
 public static void main(String[] args) {
  
  String linea;
  System.out.println("Dígame tres números en cualquier orden y yo se los ordenaré");
    linea = System.console().readLine();
  
  System.out.print("Escriba el primer número: \n");
    int primerNumero= Integer.parseInt(System.console().readLine());
    
  System.out.print("Escriba el segundo número: \n");
    int segundoNumero= Integer.parseInt(System.console().readLine());
    
  System.out.print("Escriba el tercer número: \n");
    int tercerNumero= Integer.parseInt(System.console().readLine());
    
  if ((primerNumero < segundoNumero) && (primerNumero < tercerNumero)) {
    if (segundoNumero < tercerNumero){
      System.out.println("Este es el resultado: " + primerNumero + " " + segundoNumero+ " " + tercerNumero);
    }else{
      System.out.println("Este es el resultado: " + primerNumero + " " + tercerNumero + " " + segundoNumero);
    }
  }else if ((segundoNumero < primerNumero) && (segundoNumero < tercerNumero)) {
    if (primerNumero < tercerNumero) {
      System.out.println("Este es el resultado: " + segundoNumero + " " + primerNumero + " " + tercerNumero);
  }else{
      System.out.println("Este es el resultado: " + segundoNumero + " " + tercerNumero+ " " + primerNumero);
    }
  }else if ((tercerNumero < primerNumero) && (tercerNumero < segundoNumero)) {
    if  (primerNumero < segundoNumero) {
      System.out.println("Este es el resultado: " + tercerNumero + " " + primerNumero + " " + segundoNumero);
    }else{
      System.out.println("Este es el resultado: " + tercerNumero + " " + segundoNumero + " " + primerNumero);
    }
   }
 }
}
