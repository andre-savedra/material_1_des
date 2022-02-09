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

			System.out.println("Ol� " + nome + ", sua idade �: " + idade);
		}
		// coleta o erro (se houver) e d�
		// a possibilidade de trat�-lo
		catch (Exception error) {
			System.out.println("Dados inv�lidos!");
		}

	}

}
