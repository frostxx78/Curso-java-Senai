import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

      System.out.print("Ordem: ");
      int[] valores = new int[3];

      for(int i = 0; i < args.length; i++) {
        valores[i] = Integer.parseInt(args[i]); } 

      Arrays.sort(valores);

      for(int valor : valores) {
         System.out.println(valor + " "); }
               

    }
}
