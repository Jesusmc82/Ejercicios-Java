/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 *
 * @author Jesus Martin Castro
 */
 
 public class Ejercicio13 {
  public static void main(String[] args){
  
  System.out.println("Dígame tres números enteros y yo se lo ordeno de menor a mayor");
  System.out.println("Escriba el primer número: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  System.out.println("Escriba el segundo número: ");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  System.out.println("Y el tercer y último número: ");
  int tercerNumero = Integer.parseInt(System.console().readLine());
  
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
