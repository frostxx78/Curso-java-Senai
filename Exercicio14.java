import java.util.Scanner;
public class Exercicio14 {

    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int a = in.nextInt();
    
    System.out.println("Digite o segundo valor: ");
    int b = in.nextInt();
    System.out.println("Digite o primeiro valor: ");
    int soma = 0;

    for(int i=0; i < b; i++) {
    soma = soma + a;
  }
    System.out.println("O resultado é: " + soma);  

  }

}