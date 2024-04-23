// o import java.util.Arrays serve para fazer as arrays funcionarem, sem ele vai da erro (error: cannot find symbol)
import java.util.Arrays;
public class Ordena {

   public static void main(String args[]) {
     int[] valores = new int[11];
     
// no "for" vai distinguir a ordem, se é crescente ou decrescente. abaixo é crescente

     for(int i = 0; i < args.length; i++) {
        valores[i] = Integer.parseInt(args[i]);
     }

        System.out.println("Em Ordem Crescente: "); {
 }
      
      Arrays.sort(valores);

      for(int valor : valores) {
         System.out.println(valor + " "); }

 // abaixo temos o "for" fzd a ordem decrescente
       
     //  for(int i = (valores.length-1); i >= 0; i--) {
     //     System.out.print(valores[i] + " "); }


  }

}