package item.dvd;

import item.Item;

public class Dvd extends Item {

    private int duracao;
    private String genero;

    public Dvd(String titulo, String autor, int ano, String genero, int duracao) {
        super(titulo, autor, ano);
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Gênero: " + genero);
    }
}


