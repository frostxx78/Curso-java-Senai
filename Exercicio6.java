import java.util.Scanner;

public class Exercicio6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        Double altura = in.nextDouble(); 

        System.out.print("Digite o peso: ");
        Double peso = in.nextDouble();

        System.out.print("Digite sua idade: ");
        Double idade = in.nextDouble();

        Double imc = peso/(altura*altura);
        System.out.printf("Seu IMC é: %5.2f%n",imc);


    }
}
