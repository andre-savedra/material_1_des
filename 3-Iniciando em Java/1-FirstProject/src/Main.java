import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dataInput = new Scanner(System.in);

		// tenta fazer o esperado:
		try {

			System.out.println("Digite sua idade");
			int idade = dataInput.nextInt();

			System.out.println("Digite o primeiro nome:");
			String nome = dataInput.next();

			System.out.println("Olá " + nome + ", sua idade é: " + idade);
		}
		// coleta o erro (se houver) e dá
		// a possibilidade de tratá-lo
		catch (Exception error) {
			System.out.println("Dados inválidos!");
		}

	}

}
