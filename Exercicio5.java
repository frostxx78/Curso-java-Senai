import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = in.nextDouble();
        in.nextLine(); 

        System.out.print("Digite a taxa (em %): ");
        double taxa = in.nextDouble();

        double resultado = (salario * taxa) / 100.0;

        System.out.println("Salario com o percentual: " + resultado);

        in.close();
    }
}
