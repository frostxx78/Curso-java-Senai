public class Calculo {

  public static void main(String args[]) {

       Double numero1 = Double.parseDouble(args[0]);
       String operacao = args[1];
       Double numero2 = Double.parseDouble(args[2]);
       String resultado = "";

       resultado = operacao.equals("+")?"Resultado: " + (numero1 + numero2) : 
                   operacao.equals("-")?"Resultado: " + (numero1 - numero2) : 
                   operacao.equals("/")?"Resultado: " + (numero1 / numero2) : 
                   operacao.equals("x")?"Resultado: " + (numero1 * numero2) : 
                   operacao.equals("%")?"Resultado: " + (numero1 % numero2) : "";

       System.out.println(resultado);

   }

}