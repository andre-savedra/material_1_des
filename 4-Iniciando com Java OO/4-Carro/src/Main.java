
public class Main {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		meuCarro.cor = "Prata";
		meuCarro.marca = "GM";
		meuCarro.tipo = "Sedan";
		meuCarro.nome = "Cruze";
		meuCarro.km = 35135.3f;
		meuCarro.acelerar();
		
		Carro meuCarro2 = new Carro();
		meuCarro2.cor = "Preto";
		meuCarro2.marca = "Honda";
		meuCarro2.tipo = "Hatch";
		meuCarro2.nome = "Fit";
		meuCarro2.km = 12470f;
		meuCarro2.acelerar();
		meuCarro2.acelerar();
				
		System.out.println(
				"\nCor:" +  meuCarro.cor +
				"\nMarca:" + meuCarro.marca +
				"\nTipo:" + meuCarro.tipo +
				"\nNome:" + meuCarro.nome +
				"\nKM:" + meuCarro.km + 
				"\nVel:" + meuCarro.velocidade
				);
		
		System.out.println(
				"\nCor:" +  meuCarro2.cor +
				"\nMarca:" + meuCarro2.marca +
				"\nTipo:" + meuCarro2.tipo +
				"\nNome:" + meuCarro2.nome +
				"\nKM:" + meuCarro2.km +
				"\nVel:" + meuCarro2.velocidade
				);
		
	}

}
