public class Carro implements VeiculoTerrestre {
    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor do carro desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando.");
    }

    @Override
    public void buzinar() {
        System.out.println("Carro buzinando.");
    }
}