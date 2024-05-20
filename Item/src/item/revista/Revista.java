package item.revista;

import item.Item;

public class Revista extends Item {

    private int numeroDeEdicao;
    private String mesDePublicacao;

    public Revista(String titulo, String autor, int ano, int numeroDeEdicao, String mesDePublicacao) {
        super(titulo, autor, ano);
        this.numeroDeEdicao = numeroDeEdicao;
        this.mesDePublicacao = mesDePublicacao;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Número de Edicação: " + numeroDeEdicao);
        System.out.println("Mês de Publicação: " + mesDePublicacao);
    }
}
