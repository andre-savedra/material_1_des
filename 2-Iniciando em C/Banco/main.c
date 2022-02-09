#include <stdio.h>
#include <stdlib.h>

void main() {
	
	int autenticado = 0;
	int tentativasSenha = 0;	
	int senhaCorreta = 1234;
	int senhaDigitada = 0;
	int loopSenha = 0;
	
	int opcao = 0;
	float saldo = 500.0;
	float valor = 0.0;
	
	puts("BEM-VINDO AO NOSSO BANCO!");
	
	//loop de verificação da senha	
	while(loopSenha == 0)
	{		
		puts("Digite sua senha!");
		scanf("%i", &senhaDigitada);
		
		//se a senha for correta:
		if(senhaCorreta == senhaDigitada)
		{			
			autenticado = 1;
			loopSenha = 1;
			puts("Usuario autenticado com sucesso!");
		
		}
		//senha incorreta!
		else 
		{		
			tentativasSenha++;	
			//excedeu o limite
			if(tentativasSenha >= 3)
			{
				puts("Senha incorreta, cartao bloqueado!!!");
				loopSenha = 1;	
			}
			else
			{	
				printf("Senha incorreta, tentativa %i",tentativasSenha, "/3 \n");
				puts("---------------------------");
			}	
		}		
		
	}
	
	//loop da interface do usuário
	while(autenticado == 1)
	{
		puts("\nEscolha qual a opcao desejada!");
		puts("1-Saldo");
		puts("2-Saque");
		puts("3-Depositos");
		puts("4-Encerrar");
		
		scanf("%i", &opcao);
		
		switch(opcao)
		{
			case 1:
				printf("Seu saldo e: %.2f \n\n", saldo);
			break;
			
			case 2:
				printf("Saldo em conta: %.2f \nDigite o valor a ser sacado:", saldo);
				scanf("%f", &valor);
				
				if(valor > saldo)
				{
					puts("Saldo insuficiente!");
				}
				else
				{
					saldo = saldo - valor;
				}
				
			break;
			
			case 3:
				puts("Digite o valor a ser depositado. Max = R$5000.00");
				scanf("%f", &valor);
			
				if(valor <= 5000)
				{
					puts("Deposito realizado com sucesso!");
					saldo += valor;				
				}
				else
				{
					puts("Deposito acima do limite permitido!");
				}
				
			break;
			
			case 4:
				puts("Obrigado por usar nossos servicos!");
				autenticado = 0;
			break;
			
			default:
				puts("Opcao invalida, tente novamente!");
			break;
		}
		
	}	
	
}


