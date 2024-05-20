package usuario.funcionario;

import usuario.Usuario;

public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario(String nome, String email, String telefone, String cargo) {
        super(nome, email, telefone);
        this.cargo = cargo;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cargo: " + cargo);
    }
}