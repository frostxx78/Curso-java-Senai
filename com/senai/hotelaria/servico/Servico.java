package com.senai.hotelaria.servico;

public class Servico {
    String descricao;
    double custo;

    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Serviço #####");
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Custo: " + this.custo);
        System.out.println("################################");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
