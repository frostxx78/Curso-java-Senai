public class Profissao {
   
   String nome;
   static int quantidade;
 
   public Profissao(String nome) {
    this.nome = nome;
    quantidade = quantidade + 1;
}
   public static void main(String args[]) {
   
    Profissao prof1 = new Profissao("Policial Civil");
    Profissao prof2 = new Profissao("Doutor");
    Profissao prof3 = new Profissao("Thiagao da Senai");

    System.out.println("A quantidade de profissões é " + Profissao.quantidade);

  }
}