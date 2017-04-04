/**
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Jesús Martín Castro
 */
import java.util.Scanner;
public class ejercicio08{
  public static void main (String[] arg){
     
     Scanner n = new Scanner(System.in);
     
     System.out.println("Calcularé su nota media");
     
     System.out.print("\nDígame la primera nota: ");
      double nota1 = Double.parseDouble(System.console().readLine());
     
     System.out.print("Indique su segunda nota: ");
      double nota2 = Double.parseDouble(System.console().readLine());
     
     System.out.print("Para terminar indique la tercera nota: ");
      double nota3 = Double.parseDouble(System.console().readLine());
      
      double notaMedia = (nota1 + nota2 + nota3) / 3;
     
     if ((nota1 < 0 ) || (nota2 < 0 ) || (nota3 < 0 )){
      System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
    
    } else if (( nota1 > 10 ) || ( nota2 > 10 ) || ( nota3 > 10 )){    
      System.out.printf("Las notas deben estar entre 0 - 10, para poder hacer la media\n");
    
    } 
      System.out.printf("\nSu nota media del trimestre será: %1.1f", notaMedia);
     
     if ((notaMedia>=0)&&(notaMedia<5)){
      System.out.println("\nLo sentimos su nota corresponde a un: insuficiente");
    
    } else if ((notaMedia>=5)&&(notaMedia<6)){
      System.out.println("\nSu nota corresponde a un: Suficiente");
    
    } else if ((notaMedia>=6) && (notaMedia<7)){
      System.out.println("\nSu nota corresponde a un: Bien");
    
    }else if ((notaMedia>=7) && (notaMedia<9)){
      System.out.println("\nSu nota corresponde a un: Notable");
    
    }else if ((notaMedia>=9) && (notaMedia<=10)){
      System.out.println("\nSu nota corresponde a un: Sobresaliente");
    }
   }
}
