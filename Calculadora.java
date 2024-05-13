public class Calculadora {
    // Método para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar dois números decimais
    public double somar(double a, double b) {
        return a + b;
    }
    
    // Método para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método para concatenar duas strings
    public String somar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

//Quando o método somar() é chamado com diferentes tipos de argumentos, o Java determina qual versão do método deve ser chamada com base nos tipos e na quantidade de parâmetros passados.
        
        System.out.println(calc.somar(5, 3)); // Output: 8 (inteiros)
        System.out.println(calc.somar(4.5, 3.2)); // Output: 7.7 (double)
        System.out.println(calc.somar(2, 3, 5)); // Output: 10 (três inteiros)
        System.out.println(calc.somar("Olá", " Mundo")); // Output: Olá Mundo (strings)
    }
}