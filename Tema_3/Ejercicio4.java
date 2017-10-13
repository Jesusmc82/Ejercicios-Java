/**
* Escribe un programa que sume, reste, multiplique y divida dos números
* introducidos por teclado.
*
* @author Jesus Martin Castro
*/
public class Ejercicio4 {
    public static void main(String[] args) {
      
      
      System.out.print("Introduzca dos números y yo le daré el resultado de su ");
      System.out.println("suma, resta, multiplicación y división");
      
      System.out.println("Introduzca el primero de los números: ");
        double primerNum = Double.parseDouble(System.console().readLine()); //aquí creamos la variable para la introducción del primer número que el usuario a introducido por teclado
        
      System.out.println("Ahora introduzca el segundo de los números: ");
        double segunNum = Double.parseDouble(System.console().readLine());//con esta variable hacemos el cálculo para pasar de pesetas a Euros la cantidad deseada.
        
        double suma = primerNum + segunNum;
        double resta = primerNum - segunNum;
        double multiplicación = primerNum * segunNum;
        double división = primerNum / segunNum; //estas cuatro variables son la suma, resta, multiplicacion y division de los dos números insertados por teclado
        
        System.out.printf("El resultado de la suma es:\n");
        System.out.println(" " + primerNum + " + " + segunNum + " = " + suma);
        System.out.printf("El resultado de la resta es:\n");
        System.out.println(" " + primerNum + " - " + segunNum + " = " + resta);
        System.out.printf("El resultado de la multiplicación es:\n");
        System.out.println(" " + primerNum + " x " + segunNum + " = " + multiplicación);
        System.out.printf("El resultado de la división es:\n");
        System.out.println(" " + primerNum + " / " + segunNum + " = " + división); //mostramos los resultados de las 4 operaciones realizadas.
    }
}
