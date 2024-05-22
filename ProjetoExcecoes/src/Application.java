import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        UserInputValidator userInputValidator = new UserInputValidator();
        try {
            userInputValidator.validarIdade(idade); // Idade inválida
        } catch (InvalidUserInputException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        System.out.print("Digite a String de conexão do banco: ");
        String conexao = entrada.nextLine();

        DatabaseConnector databaseConnector = new DatabaseConnector();
        try {
            databaseConnector.conectar(conexao); // String de conexão inválida
        } catch (DatabaseConnectionException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}