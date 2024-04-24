import java.util.Scanner;

public class Exercicio8 {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);

   System.out.print("Digite o Raio do circulo: ");

   Double R = in.nextDouble();
   Double PI = 3.14159;
   Double CIRC = PI*(R*R);

   System.out.printf("A circunferencia é: %5.2f%n",CIRC);


   }
 
}