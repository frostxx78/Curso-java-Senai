// Início da classe Profissao
public class Profissao {
   
   String nome;
   byte anosExperiencia; // Alterei de 'int' para 'byte'
   float salario;
   String descricao;

   public Profissao(String nomeArg, byte anosExperienciaArg,
                    float salarioArg, String descricaoArg) {
     System.out.println("############");
     nome = nomeArg;
     anosExperiencia = anosExperienciaArg;
     salario = salarioArg;
     descricao = descricaoArg;
exibirInformacoes();
     System.out.println("############\n");
  }

    public void exibirInformacoes() {
     System.out.println("Nome: " + nome);
     System.out.println("Anos de Experiência: " + anosExperiencia);
     System.out.println("Salário: " + salario); //
     System.out.println("Descrição: " + descricao);
  }
  
  public static void main(String args[]) {
    // Criando uma profissão usando objeto 
    Profissao prof1 = new Profissao("Policial Civil",
                                     (byte)6, 4750.50f, "Delegado");
    Profissao prof2 = new Profissao("Doutor",
                                     (byte)6, 9750.50f, "Medico");
    Profissao prof3 = new Profissao("Cantor",
                                     (byte)6, 4950.50f, "Kpop");
    Profissao prof4 = new Profissao("Thiagao",
                                     (byte)6, 46640.50f, "Esperto");
  }
}
