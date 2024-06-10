import java.util.Scanner;
public class Exercicio4 {

  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    int valor = 0;
    int soma = 0;
    do {
      System.out.println("Digite um número: ");
      valor = teclado.nextInt();
      soma = soma + valor;
    } while(valor !=0);

    System.out.print("A soma final é: " + soma);
  }
}