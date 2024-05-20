package item;

public class Item {
    protected String titulo;
    protected String autor;
    protected int ano;
    protected boolean emprestado;

    public Item(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(titulo + " foi devolvido.");
        } else {
            System.out.println(titulo + " não está emprestado.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    public void mostarDetalhes() {
    }
}