package item.livro;

import item.Item;

public class Livro extends Item {

    private int numeroDePaginas;
    private String genero;

    public Livro(String titulo, String autor, int ano, int numeroDePaginas, String genero) {
        super(titulo, autor, ano);
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Gênero: " + genero);
    }
}

