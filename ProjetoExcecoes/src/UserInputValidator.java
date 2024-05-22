public class UserInputValidator {
    public void validarIdade(int idade) throws InvalidUserInputException {
        if (idade < 18 || idade > 120) {
            throw new InvalidUserInputException("Idade inválida: " + idade);
        }
    }
}