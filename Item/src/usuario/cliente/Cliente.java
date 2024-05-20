package usuario.cliente;

import item.Item;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private String endereco;
    private List<Item> itensEmprestados;

    public Cliente(String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone);
        this.endereco = endereco;
        this.itensEmprestados = new ArrayList<>();
    }
    public void emprestarItem(Item item) {
        item.emprestar();
        itensEmprestados.add(item);
    }
    public void devolverItem(Item item) {
        item.devolver();
        itensEmprestados.remove(item);
    }
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Endereço: " +endereco);
        System.out.println("Itens Emprestados: ");
        for (Item item : itensEmprestados) {
            System.out.println("-" + item.getTitulo());
        }
    }

}
