import biblioteca.Biblioteca;
import item.Item;
import item.dvd.Dvd;
import item.livro.Livro;
import item.revista.Revista;
import usuario.cliente.Cliente;
import usuario.funcionario.Funcionario;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        //criando e adicionando itens
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R TOLKIEN", 1954, 1178, "Fantasia");
        Revista revista1 = new Revista("National Geographic", "Vários", 2021, 203, "Março");
        Dvd dvd1 = new Dvd("Matrix", "Lana Wachowski,Lilly Wachowski", 1999, "Ficção Cientifica", 136);

        biblioteca.adicionaritem(livro1);
        biblioteca.adicionaritem(revista1);
        biblioteca.adicionaritem(dvd1);

        //criando e adicionando usuarios
        Cliente cliente1 = new Cliente("Alice", "alice@example.com", "1234-5678", "Rua das Flores, 123");
        Funcionario funcionario1 = new Funcionario("Bob", "bob@exampple.com", "8765-432", "Bibliotecário");

        biblioteca.adicionarUsuario(cliente1);
        biblioteca.adicionarUsuario(funcionario1);

        //emprestando e devolvendo item
        cliente1.emprestarItem(livro1);
        cliente1.devolverItem(livro1);

        //mostrando detalhes dos itens
        System.out.println("\nDetalhes dos Itens:");
        livro1.mostrarDetalhes();
        System.out.println();
        revista1.mostarDetalhes();
        System.out.println();
        dvd1.mostarDetalhes();

        //mostrando inormacoes dos usuarios
        System.out.println("\nInformaçoes dos Usuarios:");
        cliente1.mostrarInformacoes();
        System.out.println();
        funcionario1.mostrarInformacoes();

        //buscando itens na biblioteca
        System.out.println("\nBusca por Título: Matrix");
        Item itemBuscado = biblioteca.buscarItem("Matrix");
        if (itemBuscado != null) {
            itemBuscado.mostrarDetalhes();
        } else {
            System.out.println("Item não encontrado.");
        }

        System.out.println("\nBuscaPorAno:1954");
        List<Item> itensBuscadosPorAno = biblioteca.buscarItem(1954);
        for (Item item : itensBuscadosPorAno) {
            item.mostarDetalhes();
            System.out.println();
        }

        System.out.println("\nBusca por Autor e Ano: J.R.R Tolkien,1954");
        List<Item> itensBuscadosPorAutorEAno = biblioteca.buscarItem("J.R.R.Tolkien",1954);
        for (Item item : itensBuscadosPorAutorEAno) {
            item.mostarDetalhes();
            System.out.println();
        }

    }
}