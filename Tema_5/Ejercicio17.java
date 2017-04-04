/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @Jesus Martin Castro
 */
 public class Ejercicio17 {
  public static void main(String[] args) {
  
  int contador=0;
  int suma= 0;
  int resultado;
  
  System.out.print("Diga un número entero y positivo, sumaré los 100 siguientes números: ");
  int numero= Integer.parseInt(System.console().readLine());
    
  if (numero<=0){
    System.out.println("Ese número no es valido, por favor introduzca un número positivo");
  }else{
      
      do{
        contador++;
        suma= numero + 1;
        resultado= numero + suma;
        System.out.println(" " + numero + " +  "+ suma + " = " + resultado + " // " + contador);
        numero++;
      }while(contador<100);
  }       
  
  }
}
