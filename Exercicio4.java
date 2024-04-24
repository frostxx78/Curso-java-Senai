import java.util.Scanner;

public class Exercicio4 {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);

   System.out.print("Digite um valor inteiro: ");
   int numero1 = in.nextInt();
   
   int resultado = numero1 * numero1;
   System.out.println("Resultado: ");
   System.out.print("O quadrado de " + numero1 + " é " + resultado);
   
   }
}
