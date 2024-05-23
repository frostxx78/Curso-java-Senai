import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/bulbassaro.txt");
        String[] nomesPokemon = {"Pikachu", "Bulbasauro", "Charmander", "Squirtle"};

        try {
            // Leitura de arquivo
            String content = Files.readString(path);
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {"Quem é essa Pokémon? : (A)Pikachu , (B)Bulbasauro , (C)Charmander , (D)Squirtle ?"};
        String[] respostas = {"B"};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.print("O pokemon é: ");
            String respostaAluno = scanner.nextLine().toUpperCase();
            if (respostaAluno.equals(respostas[i])) {
                System.out.println("Voce Acertouu!!!");
            } else {
                System.out.println("Nao foi dessa vez. A resposta correta é: " + respostas[i] + "ulbassaro");

            }
        }
    }
}