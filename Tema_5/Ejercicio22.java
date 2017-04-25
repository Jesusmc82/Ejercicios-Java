/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @Jesus Martin Castro
 */
public class Ejercicio22 {
 public static void main(String arg[]){
  
  int i;
  int j;
  boolean esPrimo;
  int rInicial=2;
  int rFinal =100;
  
  for(i = rInicial;i <= rFinal;i++){
      esPrimo=true;
       for(j = 2;j < i;j++){
       
       if(i % j == 0){
          esPrimo = false;
  
       }
       }
       
       if(esPrimo){
        System.out.println(i+"\n");
       }
  }
 }
}
