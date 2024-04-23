public class Desconto {
     public static void main(String args[]) {
       double valor = Double.parseDouble(args[0]);
      if(valor > 100.00) {

    valor = valor * 0.9;
}

    System.out.println("valor final: " + valor);

   }

}