package com.senai.hotelaria.funcionario;

public class Funcionario {

    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionario: " + nome + cargo);


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
