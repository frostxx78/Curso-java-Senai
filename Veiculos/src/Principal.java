public class  Principal {
    public static void main(String[] args) {
        VeiculoTerrestre meuCarro = new Carro();
        VeiculoAquatico meuBarco = new Barco();

        System.out.println("Testando Carro:");
        meuCarro.ligarMotor();
        meuCarro.acelerar();
        meuCarro.buzinar();
        meuCarro.frear();
        meuCarro.desligarMotor();

        System.out.println("\nTestando Barco:");
        meuBarco.ligarMotor();
        meuBarco.acelerar();
        meuBarco.ancorar();
        meuBarco.frear();
        meuBarco.desligarMotor();
    }
}