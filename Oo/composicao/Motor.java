package Oo.composicao;

public class Motor {
	double fatorDeInjecao = 1;
	boolean ligado = false;
	
	final Carro carro;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	int giros() {
		if(!ligado) {
			return 0;
		}
		else {
			return (int) Math.round(fatorDeInjecao * 3000);
		}
	}
}
