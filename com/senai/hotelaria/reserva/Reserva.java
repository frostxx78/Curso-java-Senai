package com.senai.hotelaria.reserva;

import com.senai.hotelaria.cliente.Cliente;
import com.senai.hotelaria.quarto.Quarto;
import java.time.LocalDate;

public class Reserva {

    Cliente cliente;
    Quarto quarto;
    LocalDate dataInicio;
    LocalDate dataFim;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações da Reserva #####");
        this.cliente.exibirInformacoes();
        this.quarto.exibirInformacoes();
        System.out.println("Data Início: " + this.dataInicio.toString());
        System.out.println("Data Fim: " + this.dataFim.toString());
        System.out.println("################################");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
