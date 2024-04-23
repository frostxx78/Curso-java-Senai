import java.util.Scanner;

public class Exercicio2 {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);

   System.out.print("Digite a Temperatura: ");

   Double F = in.nextDouble();
   Double C = ((F-32)*5)/9;

   System.out.println("Temperatura é: " + C);


   }
 
}