package com.senai.hotelaria.quarto;

public class Quarto {

    int numero;
    String tipo;
    boolean ocupado;

    public Quarto(String tipo, boolean ocupado, int numero) {
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.numero = numero;
    }

    public void ocuparQuarto() {
        this.ocupado = true;
    }

    public void desocuparQuarto() {
        this.ocupado = false;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Quarto #####");
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ocupado: " + this.ocupado );
        System.out.println("################################");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
