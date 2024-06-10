import java.util.Scanner;
public class Exercicio5 {

  public static void main(String args[]) { 
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro número: "); 
    int A = teclado.nextInt();

    System.out.println("Digite o segundo número: "); 
    int B = teclado.nextInt();

    int soma = 0;

    for (int i = 0; i < B; i++){

    soma = soma + A;

}

    System.out.print("O resultado é: " + soma);

  }

}