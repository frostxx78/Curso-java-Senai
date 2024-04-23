public class Nota {
     public static void main(String args[]) {
       double valor = Double.parseDouble(args[0]);
       if(valor >= 6.0) {
      System.out.println("Aproved");

      } else if(valor < 6.0) {
      System.out.println("Reproved");

      } else if(valor <= 4.0 && valor < 5.0) {
      System.out.println("Recuperation"); 
 }

    System.out.println("nota final: " + valor);

   }

}