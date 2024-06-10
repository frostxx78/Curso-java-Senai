import java.util.Scanner;

  public class Exercicio7 {
    public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Double A = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Digite o segundo número: ");
        Double B = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Digite o terceiro número: ");
        Double C = teclado.nextDouble();

        teclado.nextLine();

    Double maior = A;
     if(maior < B){
        maior = B;
}
     if(maior < C){
        maior = C;
}
    Double menor = A;
     if(menor > B){
        menor = B;
}
     if(menor > C){
        menor = C;
}

         System.out.println("O menor valor é " + menor);
         System.out.println("O maior valor é " + maior);

  }

}