public class Palindromo {

   private String str1;
   private String reverse;

   public Palindromo(String str) {
      this.str1 = str;
      this.reverter();
   }

   public void reverter() {
       this.reverse = new StringBuilder(this.str1).reverse().toString();
   }
   	
   public String toString() {
     if (this.str1.equals(this.reverse)) return "Palindromo";
     return "Não palindromo";
   }

   public static void main(String args[]) {
      Palindromo palavra = new Palindromo("civic");
      System.out.println(palavra.toString());

      Palindromo palavra2 = new Palindromo("civicte");
      System.out.println(palavra2.toString());
  }
 }