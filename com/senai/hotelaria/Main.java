package com.senai.hotelaria;

import com.senai.hotelaria.cliente.Cliente;
import com.senai.hotelaria.funcionario.Funcionario;
import com.senai.hotelaria.hotel.Hotel;
import com.senai.hotelaria.quarto.Quarto;
import com.senai.hotelaria.reserva.Reserva;
import com.senai.hotelaria.servico.Servico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("123 Rua Sol, Cidade Praia", "Hotel Estrela");

        Quarto q1 = new Quarto("Duplex",false, 123);
        Quarto q2 = new Quarto("Simples",false, 321);

        hotel.adicionarQuarto(q1);
        hotel.adicionarQuarto(q2);

        Cliente c1 = new Cliente("João Silva", "123.456.789-10", "joao.silva@email.com");

        Reserva r1 = new Reserva(c1, q1, LocalDate.now(), LocalDate.now().plusDays(3));

        hotel.adicionarReserva(r1);

        Funcionario f1 = new Funcionario("Maria Lima", "Recepcionista");

        hotel.adicionarFuncionario(f1);

        Servico s1 = new Servico("Limpeza", 50.0);

        hotel.adicionarServico(s1);

        hotel.exibirInformacoes();

    }
}
