package biblioteca;

import item.Item;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> itens;
    private  List<Usuario> usuarios;

    public Biblioteca() {
        this.itens = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void adicionaritem(Item item) {
        itens.add(item);
    }
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public Item buscarItem(String titulo) {
        for(Item item : itens) {
            if(item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }
    public List<Item> buscarItem(int ano) {
        List<Item> itensEncontrados = new ArrayList<>();
        for (Item item : itens) {
            if(item.getAno() == ano) {
                itensEncontrados.add(item);
            }
        }
        return itensEncontrados;
    }
    public List<Item> buscarItem(String autor, int ano) {
        List<Item> itensEncontrados = new ArrayList<>();
        for (Item item : itens) {
            if (item.getAutor().equalsIgnoreCase(autor)&&item.getAno() == ano) {
                itensEncontrados.add(item);
            }
        }
        return itensEncontrados;
    }
}
