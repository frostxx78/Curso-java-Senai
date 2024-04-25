import java.util.Scanner;
public class DoWhile {
    public static void main(String args[]) {
           Scanner teclado = new Scanner(System.in);
           int valor = 0;
          do {
             System.out.print("Digite um valor: "); 
             valor = teclado.nextInt();
             teclado.nextLine();
          } while (valor != 0);

          System.out.println("Obrigado, volte sempre");
    }
}
