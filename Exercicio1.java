import java.util.Scanner;

public class Exercicio1 {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);

   System.out.print("Digite a Temperatura: ");

   Double C = in.nextDouble();
   Double F = (9*C+160)/5;

   System.out.println("Temperatura é: " + F);


   }
 
}