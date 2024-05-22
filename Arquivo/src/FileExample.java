import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("./src/teste.txt");

        if (file.exists()) {
            System.out.println("O arquivo existe.");
        } else {
            System.out.println("O arquivo não existe.");
        }
    }
}