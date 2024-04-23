import java.util.Scanner;

public class Exercicio3 {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);

   System.out.print("Digite o valor de A: ");

   int A = in.nextInt();
   in.nextLine(); 

   System.out.print("Digite o valor de B: ");
 
   int B = in.nextInt();
   in.nextLine();

   int C = A;
   A = B;
   B = C;

   System.out.println("    ");
   System.out.println("Valor de A após troca: " + A);
   System.out.println("Valor de B após troca: " + B);

   in.close();
   
   }
 
}