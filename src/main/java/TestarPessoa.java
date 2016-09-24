import java.util.Scanner;


public class TestarPessoa {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		String nome = scanner.nextLine();
		System.out.println("Digite o seu CPF");
		String cpf = scanner.nextLine();
		System.out.println("Digite o seu RG");
		String rg = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa (nome, cpf, rg);
		System.out.println(nome);
		System.out.println(rg);
		System.out.println(cpf);
	}

}
