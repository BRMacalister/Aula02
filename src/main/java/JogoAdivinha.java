import java.util.Random;
import java.util.Scanner;
// O comando Ctrl + Shift + F organiza os códigos. "Identização".
public class JogoAdivinha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Tente adivinhar o número gerado pelo sistema...");

		int numeroGerado = new Random().nextInt(10) + 1;
		int numero = scanner.nextInt();
		int tentativas = 1;

		while (numero != numeroGerado) {
			tentativas++; // ou tentativas = tentativas +1;
			System.out.println("Você errou! Tente outra vez...");
			numero = scanner.nextInt();
		}
		System.out.println("Você acertou em " + tentativas + " tentativas !!!");
	}
}
