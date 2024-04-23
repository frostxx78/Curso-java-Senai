public class Carro {

  String modelo;
  String cor;
  int ano;

  public Carro(String modelo, String cor, int ano) {
   this.modelo = modelo;
   this.cor = cor;
   this.ano = ano;
  }

  public void exibirInformacoes() {
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Cor: " + this.cor);
       System.out.println("Ano: " + this.ano);
  }

  public static void main(String[] args) {
    Carro primeiroCarro = new Carro("Mustang", "Preto", 1976);
    Carro segundoCarro = new Carro("Masserati", "Azul", 2022);
    Carro terceiroCarro = new Carro("Ford", "Amarelo", 2021);

    primeiroCarro.exibirInformacoes(); 
    segundoCarro.exibirInformacoes();
    terceiroCarro.exibirInformacoes();
  }

}