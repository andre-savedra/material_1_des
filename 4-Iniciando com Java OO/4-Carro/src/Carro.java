
public class Carro {	
	String cor;
	String marca;
	String tipo;
	String nome;
	int qtdPortas;
	int velocidade;
	float km;
	float potencia;	
	
	public Carro() {		
		this.cor = "Branca";
		this.marca = "indefinido";
		this.tipo = "indefinido";
		this.nome = "indefino";
		this.qtdPortas = 3;
		this.velocidade = 0;
		this.km = 0f;
		this.potencia = 1.0f;
	}
	
	public void acelerar() {
		this.velocidade += (this.potencia * 10);
	}
	
}


