import java.util.Scanner;

  public class Exercicio6 {
    public static void main(String args[]){ 
      Scanner teclado = new Scanner(System.in);

      System.out.println("Digite a altura: "); 
      Double altura = teclado.nextDouble();

      teclado.nextLine();

      System.out.println("Digite o peso: "); 
      Double peso = teclado.nextDouble();
    
      teclado.nextLine();

      System.out.println("Digite sua idade: "); 
      Double idade = teclado.nextDouble();

  Double imc = peso/(altura*altura);
  System.out.printf("Seu IMC é: %5.2f%n", imc);

  }

}