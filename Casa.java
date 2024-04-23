/* Exemplos de dados de uma casa
*/

public class Casa {

      private String endereco;
      private int numeroDeQuartos;
      private int numeroDeBanheiros;
      private boolean luzesAcesas;

/* o private boolean nao esta sendo apresentado, ou seja codigo morto
*/    

      public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
           this.endereco = endereco;
           this.numeroDeQuartos = numeroDeQuartos;
           this.numeroDeBanheiros = numeroDeBanheiros;

/* luzesAcesas nao esta sendo usado pq ele nao foi colocado nos objetos,
abaixo é como as informaçoes serao exibidas
*/

       }

       public void exibirInformacoes() {
              System.out.println("Endereço: " + endereco);
              System.out.println("Número de Quartos: " + numeroDeQuartos);
              System.out.println("Número de Banheiros: " + numeroDeBanheiros);

       }

/* o main é o principal para o funcionamento do código
*/

       public static void main(String[] args) {
             Casa minhaCasa = new Casa("123 Rua Alegre", 3, 2);
             minhaCasa.exibirInformacoes();
        }
}