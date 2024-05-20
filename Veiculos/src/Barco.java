public class Barco implements VeiculoAquatico {
    @Override
    public void ligarMotor() {
        System.out.println("Motor do barco ligado.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor do barco desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Barco acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Barco freando.");
    }

    @Override
    public void ancorar() {
        System.out.println("Barco ancorado.");
    }
}