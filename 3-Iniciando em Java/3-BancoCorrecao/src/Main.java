import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int autenticado = 0;
		int tentativasSenha = 0;
		String senhaCorreta = "senai123";
		String senhaDigitada = "";
		int loopSenha = 0;

		int opcao = 0;
		float saldo = 500f;
		float valor = 0f;

		JOptionPane.showMessageDialog(null, "BEM-VINDO AO NOSSO BANCO!", "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);

		// loop de verificação da senha
		while (loopSenha == 0) {
			senhaDigitada = JOptionPane.showInputDialog(null, "Digite sua senha!", "Autenticação",
					JOptionPane.WARNING_MESSAGE);

			// se a senha for correta:
			if (senhaCorreta.equals(senhaDigitada)) {
				autenticado = 1;
				loopSenha = 1;
				JOptionPane.showMessageDialog(null, "Usuário autenticado com sucesso!", "Sucesso!",
						JOptionPane.INFORMATION_MESSAGE);
			}
			// senha incorreta!
			else {
				tentativasSenha++;
				// excedeu o limite
				if (tentativasSenha >= 3) {
					JOptionPane.showMessageDialog(null, "Senha incorreta, cartão bloqueado!!!", "Bloqueio!",
							JOptionPane.ERROR_MESSAGE);
					loopSenha = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Senha incorreta, tentativa " + tentativasSenha + "/3",
							"Bloqueio!", JOptionPane.ERROR_MESSAGE);

				}
			}
		}
			
		
		//loop da interface do usuário
		while(autenticado == 1)
		{
					
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog(null, 
					"Escolha qual a opção desejada!\n"
					+ "1-Saldo\n2-Saque\n3-Depósitos\n"
					+ "4-Encerrar", "Sua Conta",
					JOptionPane.INFORMATION_MESSAGE)
				); 
			
			switch(opcao)
			{
				case 1:
					JOptionPane.showMessageDialog(null, 
							"Seu saldo é: R$" + saldo,
							"Saldo", JOptionPane.INFORMATION_MESSAGE);
				break;
				
				case 2:
					valor = Float.parseFloat(
							JOptionPane.showInputDialog(null, 
							"Seu saldo é: R$" + saldo +
						    "\nDigite o valor a ser sacado:", 
							"Sua Conta",
							JOptionPane.INFORMATION_MESSAGE)
						); 					
										
					if(valor > saldo)
					{
						JOptionPane.showMessageDialog(null, 
								"Saldo insuficiente!",
								"Error", JOptionPane.ERROR_MESSAGE);						
					}
					else
					{
						saldo = saldo - valor;
						JOptionPane.showMessageDialog(null, 
								"Saque efetuado com sucesso!",
								"Sucesso!", JOptionPane.INFORMATION_MESSAGE);
					}
					
				break;
				
				
				case 3:
					valor = Float.parseFloat(
							JOptionPane.showInputDialog(null, 
							"Digite o valor a ser depositado.\n"
							+ "Max = R$5000.00",
							"Sua Conta",
							JOptionPane.INFORMATION_MESSAGE)
						); 
					
									
					if(valor <= 5000)
					{
						JOptionPane.showMessageDialog(null, 
								"Depósito efetuado com sucesso!",
								"Sucesso!", JOptionPane.INFORMATION_MESSAGE);
						saldo += valor;				
					}
					else
					{
						JOptionPane.showMessageDialog(null, 
								"Depósito acima do limite permitido!",
								"Erro!", JOptionPane.ERROR_MESSAGE);						
					}
					
				break;
				
				case 4:
					JOptionPane.showMessageDialog(null, 
							"Obrigado por usar nossos servicos!",
							"Até logo!", JOptionPane.INFORMATION_MESSAGE);
					autenticado = 0;
				break;
				
				default:
					JOptionPane.showMessageDialog(null, 
							"Opção inválida, tente novamente!",
							"Erro", JOptionPane.ERROR_MESSAGE);
				break;
			}
			
		}

	}

}
